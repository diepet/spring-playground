insert into location (id, city) values (hibernate_sequence.nextval, 'Milano');
insert into location (id, city) values (hibernate_sequence.nextval, 'Napoli');
insert into location (id, city) values (hibernate_sequence.nextval, 'Torino');
insert into location (id, city) values (hibernate_sequence.nextval, 'Roma');

-- insert into customer(id, first_name, last_name, location_id) values 
-- (hibernate_sequence.nextval, 'Diego Armando' 'Maradona', (select id from location where city='Napoli'));
-- insert into customer(id, first_name, last_name, location_id) values 
-- (hibernate_sequence.nextval, 'Marco' 'Van Basten', (select id from location where city='Milano'));
-- insert into customer(id, first_name, last_name, location_id) values 
-- (hibernate_sequence.nextval, 'Antonio' 'Careca', (select id from location where city='Napoli'));
-- insert into customer(id, first_name, last_name, location_id) values 
-- (hibernate_sequence.nextval, 'Gaetano' 'Scirea', (select id from location where city='Torino'));
-- insert into customer(id, first_name, last_name, location_id) values 
-- (hibernate_sequence.nextval, 'Carlo' 'Ancelotti', (select id from location where city='Roma'));
