'''
Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:

Station.jpg

where LAT_N is the northern latitude and LONG_W is the western longitude.
'''
select distinct city from station
where left(city,1) in ('a','e','i','o','u') 
and right(city,1) in ('a','e','i','o','u') ;
