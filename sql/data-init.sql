-- Roles
INSERT INTO role_entity (id, name) VALUES
    (1, 'ROLE_USER'),
    (2, 'ROLE_ADMIN');

-- Planes
INSERT INTO planes (id, nombre, precio, datos_gb, minutos, sms, descripcion) VALUES
    (1, 'Plan Básico', 30000, 10, 100, 50, 'Plan básico para usuarios normales'),
    (2, 'Plan Plus', 50000, 30, 300, 200, 'Plan intermedio para usuarios frecuentes'),
    (3, 'Plan Premium', 80000, 100, 1000, 500, 'Plan avanzado para empresas o usuarios exigentes'),
    (4, 'Plan Estudiante', 20000, 5, 50, 20, 'Plan especial para estudiantes'),
    (5, 'Plan Empresarial', 120000, 300, 3000, 1500, 'Plan para empresas grandes'),
    (6, 'Plan Familiar', 90000, 80, 800, 400, 'Plan para grupos familiares'),
    (7, 'Plan Avanzado', 100000, 200, 2000, 1000, 'Plan avanzado de datos y minutos'),
    (8, 'Plan Ilimitado', 150000, 1000, 10000, 5000, 'Plan ilimitado para heavy users'),
    (9, 'Plan Pyme', 70000, 50, 600, 250, 'Plan especial para PYMES'),
    (10, 'Plan Prepago', 15000, 2, 20, 10, 'Plan prepago económico');

-- Usuarios
INSERT INTO usuarios
(id, nombre, password, email, num_cuenta, num_identificacion, num_telefono, plan_id, role_id, creado_en)
VALUES
    (1, 'Juan Pérez',    '$2a$10$Ttj0GDqa5sV8RBjClG69dOik6aN31DXkb5lSvIBUfuqnNUs.CtQKu', 'juan@gmail.com',  '1234567890', '10101010', '3001112233', 1, 1, NOW()),
    (2, 'Ana Gómez',     '$2a$10$9k44LKmE.l4LX4DCFuiZp.P2JKbLJMc/sCCrhNWrBXjGrUGOarcNm', 'ana@gmail.com',   '2345678901', '20202020', '3002223344', 2, 2, NOW()),
    (3, 'Carlos Torres', '$2a$10$Hk5In/uPob1YGdg0XOxlve0we4ZghrlIlytWURLYFC7327JAC7H0e', 'carlos@gmail.com','3456789012', '30303030', '3003334455', 3, 1, NOW()),
    (4, 'Elena Ruiz',    '$2a$10$Xk1B6eDR1p9U1zEMvGfI9OdE4m1nVnKjHT6S9E/POZKfXWqN1nJTu', 'elena@gmail.com', '4567890123', '40404040', '3004445566', 4, 2, NOW()),
    (5, 'Luis Mendoza',  '$2a$10$XsEpUMxGJzOiOavU6wlfEOv4Krvv1jRug8vF9tm8Vmc1WpQjlXQPu', 'luis@gmail.com',  '5678901234', '50505050', '3005556677', 5, 1, NOW()),
    (6, 'Sofía Martínez','$2a$10$h0zJDKvI5nJo8rGfa0wOdeLHOZ4JwDNo1Oy0QCuX71v59iO41wXqW', 'sofia@gmail.com', '6789012345', '60606060', '3006667788', 6, 2, NOW()),
    (7, 'Pedro Rivera',  '$2a$10$8kkJG/dw0MrbYkxOwz5d2ej/cRknlPVU.yr85nTYxgJth2zzYkQme', 'pedro@gmail.com', '7890123456', '70707070', '3007778899', 7, 1, NOW()),
    (8, 'Laura Castro',  '$2a$10$1wr9fIyywVjMkmk9gtMdiulx5H/EkEmv6hXkzUtO4Um90szNc2owG', 'laura@gmail.com', '8901234567', '80808080', '3008889900', 8, 2, NOW()),
    (9, 'Javier Salas',  '$2a$10$y5MeIv3XyYaR1QXTXSwgrutKxnp1P0aWJv4ex3NidMXNGwJKynTQy', 'javier@gmail.com','9012345678', '90909090', '3009990011', 9, 1, NOW()),
    (10,'María López',   '$2a$10$ba6loF1ly0V6m1NxMCEH5uSSHyAfRZc/oQ.DsudUNp9/y5VL2u0Ye', 'maria@gmail.com', '1234509876', '11111111', '3001011122', 10, 1, NOW());

-- Facturas
INSERT INTO facturas
(id, usuario_id, plan_id, periodo, monto, fecha_vencimiento, fecha_creacion)
VALUES
    (1, 1, 1, '2024-06', 31000, '2024-07-15', '2024-06-30'),
    (2, 2, 2, '2024-06', 51000, '2024-07-15', '2024-06-30'),
    (3, 1, 1, '2024-07', 30000, '2024-08-15', '2024-07-31'),
    (4, 3, 3, '2024-06', 81000, '2024-07-15', '2024-06-30'),
    (5, 4, 4, '2024-08', 22000, '2024-09-15', '2024-08-31'),
    (6, 5, 5, '2024-08', 125000, '2024-09-15', '2024-08-31'),
    (7, 6, 6, '2024-08', 91000, '2024-09-15', '2024-08-31'),
    (8, 7, 7, '2024-09', 101000, '2024-10-15', '2024-09-30'),
    (9, 8, 8, '2024-09', 151000, '2024-10-15', '2024-09-30'),
    (10, 9, 9, '2024-09', 71000, '2024-10-15', '2024-09-30');

-- Consumos
INSERT INTO consumos
(id, usuario_id, plan_id, datos_gb, minutos, sms, ultima_actualizacion)
VALUES
    (1, 1, 1, 5,   70,   25,  NOW()),
    (2, 2, 2, 18, 250,  100,  NOW()),
    (3, 3, 3, 60, 700,  300,  NOW()),
    (4, 4, 4, 3,   15,   6,   NOW()),
    (5, 5, 5, 120, 2000, 800, NOW()),
    (6, 6, 6, 62,  501,  220, NOW()),
    (7, 7, 7, 90,  1010, 500, NOW()),
    (8, 8, 8, 880, 9000, 4000, NOW()),
    (9, 9, 9, 45,  400,  180, NOW()),
    (10,10,10,1,   5,    2,   NOW());
