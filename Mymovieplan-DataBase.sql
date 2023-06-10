create table movies(
Id INT PRIMARY KEY AUTO_INCREMENT,
added_on date,
bg_image Text,
caption varchar(255),
duration integer,
image TEXT,
releasedate date,
language varchar(255),
name varchar(255),
story varchar(9000),
year integer

);

select * from auditoriums;
select * from movies;
select * from movie_shows;
select * from booked_seats;
select * from payments;
select * from prices;
select * from shows;  
select * from users;
select * from movie_genres;
select * from auditorium_facilities;
select * from auditorium_safeties;
select * from booking_details;
select * from bookings;



DELETE FROM booking_details WHERE id=2;

INSERT INTO users(id,email,gender,is_account_non_expired,is_account_non_locked,is_credentials_non_expired,is_enabled,mobile,name,password)VALUES
(1,"syam@123","Male",1,1,1,1,8008208107,"syam","Sp123");
INSERT INTO auditoriums(id,address,customer_care_no,email,image,name,seat_capacity)VALUES 
(12,"Hyderabad",08812-222222,"prasanna@123","Virupaksha","INOX",200);
INSERT INTO movie_shows(id,show_end,movie_id,show_start,price_id,show_id)VALUES
(15,"2023-06-30",4,"2023-04-05",4,52);
INSERT INTO prices(id,general,gold,silver)VALUES
(5,"400.00","800.00","500.00");
INSERT INTO shows(name,start_time,auditorium_id)VALUES
("Second Show","09:00PM",12);
INSERT INTO payments(id,amount,card_cvv,card_expiry_month,card_expiry_year,card_number,payment_date)VALUES
(2,3000.00,1234,"March",2023,123456789,"2021-05-15");
INSERT INTO movies(id,added_on,bg_image,image,language,name,year,releasedate)VALUES
(4,"2023-04-01","VIRUPAKSHA","VIRUPAKSHA","Telugu","VIRUPAKSHA",2023,"2023-04-05");
INSERT INTO movie_genres(movie_id,genre) VALUES
(4,"Romance,Crime,Drama,Thriller");
INSERT INTO auditorium_facilities(auditorium_id,facility)VALUES
(12,"DOLBY SOUND AND HD QUALITY WITH A/C and car parking");
INSERT INTO auditorium_safeties(auditorium_id,safety)VALUE
(12,"FIRE System");