CREATE TRIGGER DeleteOnEmissions
ON dbo.Emissions
AFTER DELETE
AS
BEGIN
    CREATE OR INSERT INTO dbo.Emissions_log(
		Country,
		Abbrev ,
		Year,
		Total,
		From_Coal,
		From_Oil,
		From_Gas,
		From_Cement,
		From_Flaring,
		From_Other,
		Per_Capita
    )

    SELECT 
        Country,
		Abbrev ,
		Year,
		Total,
		From_Coal,
		From_Oil,
		From_Gas,
		From_Cement,
		From_Flaring,
		From_Other,
		Per_Capita
    FROM deleted;
END