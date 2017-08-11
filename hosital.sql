create database hospital;

use hospital

-----Patient Table
create table patient( id int not null, firstName varchar(255), lastName varchar(255), DOB datetime, gender varchar(10), Primary Key (ID));


insert into patient values(1,"Saurabh","Palaspagar",'1991-05-01',"Male");
insert into patient values(2,"Bhavik","Bhavsar",'1992-09-08',"Male");
insert into patient values(3,"Abhi","Sheshadri",'1990-01-05',"Male");
insert into patient values(4,"Adi","Udaykumar",'1988-08-07',"Male");
insert into patient values(5,"Ritika","Singh",'1880-03-01',"Female");

-----Data with time
insert into patient values(1,"Saurabh","Palaspagar",'1991-05-01 05:00:00',"Male");
insert into patient values(2,"Bhavik","Bhavsar",'1992-09-08 10:00:00',"Male");
insert into patient values(3,"Abhi","Sheshadri","1990-01-05 10:00:00","Male");
insert into patient values(4,"Adi","Udaykumar","1988-08-07 00:00:00,"Male");
insert into patient values(5,"Ritika","Singh","1880-03-01 10:00:00","Female");


---Patient List
select * from patient;

-----Problem Table
create table problem (id int not null, name varchar(255), notes varchar(255), start_date datetime, end_date datetime, status varchar(8), patient_id int , Primary Key (id), Foreign Key(patient_id) references patient(id));

insert into problem values (1,"Knee Pain","Marathon Runner",'2017-08-07 10:00:00',"","active",1);
insert into problem values (2,"Knee Pain","Walker",'2017-08-02','2017-08-05',"inactive",3);
insert into problem values (3,"Headache","New Job",'2017-08-03',"","active",2);
insert into problem values (4,"Vision loss","Excessive Iphone use",'2015-03-01',"","active",4);

-----Find problem list

select * from problem;

----Find Patient id and name using the disease name

select p.id AS "Patient ID", p.firstName,p.lastName, l.name as"Problem",l.status from problem l inner join patient p on p.id=l.patient_id where name="Knee Pain";

------Medication Table
create table medication (id int not null, name varchar(255), dosage varchar(255), start_date datetime, end_date datetime, patient_id int , Primary Key (id), Foreign Key(patient_id) references patient(id));

insert into medication values (1,"Relispray","4 Times a day","08-07-2017","",1);
insert into medication values (2,"Pain Killer","3 mg ","08-02-2017","08-05-2017",3);
insert into medication values (3,"Advill","6mg","08-03-2017","",2);
insert into medication values (4,"Eye drops","20ml","03-01-2015","",4);

---Find all medication
select * from medication;

----Find Patient based on medication
select p.id AS "Patient ID", p.firstName,p.lastName, l.name as"Medication" from medication l inner join patient p on p.id=l.patient_id where name="Advill";

-----Allergy Table
create table allergy (id int not null, substance varchar(255), reaction varchar(255), start_date datetime, end_date datetime, status varchar(8), patient_id int , Primary Key (id), Foreign Key(patient_id) references patient(id));

insert into allergy values (1,"Dust","Body pain","08-02-2017","08-05-2017","inactive",3);
insert into allergy values (2,"Sun","Head pain","08-03-2017","","active",2);
insert into allergy values (3,"Dust","Eye itch","03-01-2015","","active",4);

---List of Allergies
select * from allergy;

----Find Patient id and name using the substance name

select p.id AS "Patient ID", p.firstName,p.lastName, l.substance as"Substance",l.status from allergy l inner join patient p on p.id=l.patient_id where substance="Dust";
