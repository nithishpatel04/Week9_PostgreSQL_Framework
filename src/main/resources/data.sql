INSERT INTO rooms (room_size, no_of_beds, condition, rent)
VALUES (250.0, 1, 'Good', 80);

INSERT INTO rooms (room_size, no_of_beds, condition, rent)
VALUES (380.0, 2, 'Excellent', 120);

INSERT INTO guests (guest_name, contact, email, address, room_id)
VALUES ('Noble Reddy', '647-555-1001', 'noble@example.com', '12 Bay St, Toronto', 1);

INSERT INTO guests (guest_name, contact, email, address, room_id)
VALUES ('Asiya J', '647-555-2002', 'asiya@example.com', '88 King St, Toronto', 2);

INSERT INTO receptionist (rec_password, phone, email) VALUES ('pass123','555-111-2222','alice@hotel.com');
INSERT INTO receptionist (rec_password, phone, email) VALUES ('pass456','555-333-4444','bob@hotel.com');
