'''
Query all columns for all American cities in the CITY table with populations larger than 100000. The CountryCode for America is USA.

The CITY table is described as follows:

CITY.jpg
'''
select * from CITY 
where population>100000 and CountryCode="USA"
