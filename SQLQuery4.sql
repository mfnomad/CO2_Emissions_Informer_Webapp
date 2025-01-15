ALTER FUNCTION [dbo].[MaxEmissionsPerCapitaCountryInYear](@_year int)
 RETURNS varchar(255)
 
 AS
 BEGIN
 
 IF @_year > 2021 OR @_year < 1820
 BEGIN
	Return('ERROR: Input Year must be less than 2021 and more than 1819')
	END
 
 DECLARE @_Country VARCHAR(255);

 SELECT TOP 1 @_Country = Country
 FROM dbo.Emissions
 WHERE [Year] = @_year
 ORDER BY Per_Capita DESC;
 RETURN @_Country;
 
 
 END

