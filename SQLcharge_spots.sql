CREATE TABLE IF NOT EXISTS `spots` (
  `spot_id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `location` varchar(20) NOT NULL,
  `gmaps_location_1` varchar(100) NOT NULL,
  `gmaps_location_2` varchar(100) NOT NULL,
  `img` varchar(300) NOT NULL,
  PRIMARY KEY (`spot_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


INSERT INTO `spots` (`spot_id`, `name`, `address`, `location`, `gmaps_location_1`, `gmaps_location_2`, `img`) VALUES
	(1, 'Escales Corte Ingles', 'Avingudes Joan I', 'Palma de Mallorca', '123456789', '123456798', 'img1'),
	(2, 'Escales Biblioteca Municipal', 'Plaça Santa Catalina', 'Palma de Mallorca', '123456789', '123456789', 'img2' ),
	(3, 'Hotel Duva(Temporada Hivern)', 'Passeig Londres', 'Port de Pollença', '123456789', '123456789','img3'); 