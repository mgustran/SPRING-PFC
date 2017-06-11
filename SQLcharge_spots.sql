CREATE TABLE IF NOT EXISTS `spots` (
  `spot_id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `address` varchar(50) NOT NULL,
  `location` varchar(20) NOT NULL,
  `gmaps_location_1` DOUBLE NOT NULL,
  `gmaps_location_2` DOUBLE NOT NULL,
  `img` varchar(300) NOT NULL,
  PRIMARY KEY (`spot_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


INSERT INTO `spots` (`spot_id`, `name`, `address`, `location`, `gmaps_location_1`, `gmaps_location_2`, `img`) VALUES
	(1, 'Escales Corte Ingles', 'Avingudes Joan I', 'Palma de Mallorca', 39.573158, 2.656390, '../img/spots/1.jpg'),
	(2, 'Escales Biblioteca Municipal', 'Plaça Santa Catalina', 'Palma de Mallorca', 39.570795, 2.642993, '../img/spots/2.jpg' ),
	(3, 'Hotel Daina(Temporada Hivern)', 'Atilio Bover', 'Port de Pollença', 39.907601, 3.082966,'../img/spots/3.jpg'),
	(4, 'Olivia Apartment (Temporada Hivern)', 'Calle sin Nombre', 'Port de Pollença', 39.912145, 3.092094,'../img/spots/4.jpg'),
	(5, 'Plaça Quadrado', 'Plaça Quadrado', 'Palma de Mallorca', 39.569552, 2.653785,'../img/spots/5.jpg'),
	(6, 'SkatePark Sa Riera', 'Parc de Sa Riera', 'Palma de Mallorca', 39.585472, 2.639489,'../img/spots/6.jpg'),
	(7, 'Mercat del Olivar', 'Santa Catalina de Sena', 'Palma de Mallorca', 39.574053, 2.653050,'../img/spots/7.jpg'),
	(8, 'Plaza del Tubo', ' Avinguda dAlemanya', 'Palma de Mallorca', 39.576800, 2.646466,'../img/spots/8.jpg'),
	(9, 'Parc de les Estacions', 'Parc de les Estacions', 'Palma de Mallorca', 39.577426, 2.656279,'../img/spots/9.jpg'),
	(10, 'Plaça de les Columnes, Portitxol', 'Carrer de Felicià Fuster', 'Palma de Mallorca', 39.561320, 2.666491,'../img/spots/10.jpg');