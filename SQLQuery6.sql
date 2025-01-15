CREATE TRIGGER UpdateOnEmissions
ON dbo.Emissions
FOR UPDATE
AS
BEGIN
    
    DECLARE @Country VARCHAR(255);
    DECLARE @Year INT;
    DECLARE @OldTotal FLOAT;
    DECLARE @NewTotal FLOAT;

    SELECT 
        @Country = i.Country,
        @Year = i.Year,
        @OldTotal = o.Total,
        @NewTotal = i.Total
    FROM inserted i
    JOIN deleted o ON i.Country = o.Country AND i.Year = o.Year;

    
    PRINT 'Old: Country = ' + @Country + ', Year = ' + CAST(@Year AS VARCHAR) + ', Total Emissions = ' + CAST(@OldTotal AS VARCHAR);
    PRINT 'Updated: Country = ' + @Country + ', Year = ' + CAST(@Year AS VARCHAR) + ', Total Emissions = ' + CAST(@NewTotal AS VARCHAR);
END;

UPDATE Emissions
SET Total = 18.3333333331
WHERE Country = 'Germany' AND Year = 1750;
