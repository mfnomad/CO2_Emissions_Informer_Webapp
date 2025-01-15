ALTER PROCEDURE PrintEmissionsByYear(@_year AS INT)
AS
BEGIN
    DECLARE @SummaryCursor AS CURSOR;
    DECLARE @_country AS VARCHAR(100);
    DECLARE @_total AS FLOAT;
    DECLARE @_From_Coal AS FLOAT;
    DECLARE @_From_Oil AS FLOAT;
    DECLARE @_From_Gas AS FLOAT;
    DECLARE @_Per_Capita AS FLOAT;
    
    SET @SummaryCursor = CURSOR FOR
    SELECT Country, Total, From_Coal, From_Oil, From_Gas, Per_Capita
    FROM dbo.Emissions
    WHERE [Year] = @_year; 

    OPEN @SummaryCursor;

    FETCH NEXT FROM @SummaryCursor 
    INTO @_country, @_total, @_From_Coal, @_From_Oil, @_From_Gas, @_Per_Capita;

    WHILE @@FETCH_STATUS = 0
    BEGIN
        PRINT('Country: ' + @_country + ' in the year: ' + CAST(@_year AS VARCHAR(10)) + ' had the following emissions:' + CHAR(13) +
              CAST(@_total AS VARCHAR(50)) + ' total Emissions' + ', from Coal: ' + CAST(@_From_Coal AS VARCHAR(50)) + 
              ', From Oil: ' + CAST(@_From_Oil AS VARCHAR(50)) + ', From Gas: ' + CAST(@_From_Gas AS VARCHAR(50)) + 
              ', total per Capita Emissions: ' + CAST(@_Per_Capita AS VARCHAR(50)) + CHAR(13) );

        FETCH NEXT FROM @SummaryCursor 
        INTO @_country, @_total, @_From_Coal, @_From_Oil, @_From_Gas, @_Per_Capita;
    END

    CLOSE @SummaryCursor;
    DEALLOCATE @SummaryCursor;
END
