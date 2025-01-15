USE CO2Emissions;
CREATE TABLE Emissions_log (
    Country varchar(255),
    Abbrev varchar(3),
    Year int,
    Total float,
    From_Coal float,
	From_Oil float,
	From_Gas float,
	From_Cement float,
	From_Flaring float,
	From_Other float,
	Per_Capita float
);

SELECT * FROM Emissions_log;