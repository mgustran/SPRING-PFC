CREATE TABLE IF NOT EXISTS `articles` (
  `article_id` int(5) NOT NULL AUTO_INCREMENT,
  `model` varchar(200) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `category` varchar(100) NOT NULL,
  `price` varchar(10) NOT NULL,
  `description` varchar(300) NOT NULL,
  `discount` varchar(10) NOT NULL,
  `talla` varchar(20) NOT NULL,
  `img` varchar(100) NOT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


INSERT INTO `articles` (`article_id`, `model`, `marca`, `category`, `price`, `description`, `discount`, `talla`, `img`) VALUES

#   TABLAS  ------------------------
  (1, 'Haslam', 'Almost', 'Tablas', '35,00 €', 'Table to ride the sky', '5%', '8.1', '../img/articles/tablas/almost/1.jpg'),
  (2, 'Youness', 'Almost', 'Tablas', '30,00 €', 'Table to ride the sky', '0%', '8', '../img/articles/tablas/almost/2.jpg'),
  (3, 'DacWon', 'Almost', 'Tablas', '25,00 €', 'Table to ride the sky', '8%', '8.1', '../img/articles/tablas/almost/3.jpg'),
  (4, 'Demons', 'Almost', 'Tablas', '30,00 €', 'Table to ride the sky', '0%', '7.9', '../img/articles/tablas/almost/4.jpg'),

  (5, 'Angelides', 'Blind', 'Tablas', '30,00 €', 'Table to ride the blind side of life', '10%', '7.7', '../img/articles/tablas/blind/1.jpg'),
  (6, 'HorganSmith', 'Blind', 'Tablas', '40,00 €', 'Table to ride the blind side of life', '0%', '8', '../img/articles/tablas/blind/2.jpg'),
  (7, 'TJRogers', 'Blind', 'Tablas', '30,00 €', 'Table to ride the blind side of life', '0%', '7.9', '../img/articles/tablas/blind/3.jpg'),
  (8, 'Romar', 'Blind', 'Tablas', '40,00 €', 'Table to ride the blind side of life', '0%', '7.8', '../img/articles/tablas/blind/4.jpg'),

  (9, 'Green', 'Element', 'Tablas', '30,00 €', 'Table to ride the four elements', '10%', '7.8', '../img/articles/tablas/element/1.jpg'),
  (10, 'Rise&Shine', 'Element', 'Tablas', '40,00 €', 'Table to ride the four elements', '0%', '8.2', '../img/articles/tablas/element/2.jpg'),
  (11, 'NijahRed', 'Element', 'Tablas', '30,00 €', 'Table to ride the four elements', '0%', '7.7', '../img/articles/tablas/element/3.jpg'),
  (12, 'NijahGreen', 'Element', 'Tablas', '40,00 €', 'Table to ride the four elements', '0%', '8', '../img/articles/tablas/element/4.jpg'),

  (13, 'Borden', 'SantaCruz', 'Tablas', '30,00 €', 'Table to ride the blind side of life', '10%', '7.7', '../img/articles/tablas/santacruz/1.jpg'),
  (14, 'Guzman', 'SantaCruz', 'Tablas', '40,00 €', 'Table to ride the blind side of life', '0%', '7.9', '../img/articles/tablas/santacruz/2.jpg'),
  (15, 'Knox', 'SantaCruz', 'Tablas', '30,00 €', 'Table to ride the blind side of life', '0%', '8.1', '../img/articles/tablas/santacruz/3.jpg'),
  (16, 'StarWars', 'SantaCruz', 'Tablas', '40,00 €', 'Table to ride the blind side of life', '0%', '7.9', '../img/articles/tablas/santacruz/4.jpg'),


#   EJES  --------------------------
  (17, 'GreyClassic', 'Destructo', 'Ejes', '25,00 €', 'Trucks to destruct the ground', '0%', '5.5', '../img/articles/ejes/destructo/1.jpg'),
  (18, 'SuperLight', 'Destructo', 'Ejes', '15,00 €', 'Trucks to destruct the ground', '0%', '4.9', '../img/articles/ejes/destructo/2.jpg'),
  (19, 'ArmorLit-Black', 'Destructo', 'Ejes', '20,00 €', 'Trucks to destruct the ground', '0%', '5.0', '../img/articles/ejes/destructo/3.jpg'),
  (20, 'ArmorLit-Pink', 'Destructo', 'Ejes', '15,00 €', 'Trucks to destruct the ground', '20%', '5.5', '../img/articles/ejes/destructo/4.jpg'),

  (21, 'Original', 'Independent', 'Ejes', '20,00 €', 'Trucks to be more free', '10%', '5.0', '../img/articles/ejes/independent/1.jpg'),
  (22, 'Black&Blue', 'Independent', 'Ejes', '25,00 €', 'Trucks to be more free', '0%', '5.5', '../img/articles/ejes/independent/2.jpg'),
  (23, 'Whities', 'Independent', 'Ejes', '15,00 €', 'Trucks to be more free', '10%', '5.0', '../img/articles/ejes/independent/3.jpg'),
  (24, 'RVEGrey', 'Independent', 'Ejes', '20,00 €', 'Trucks to be more free', '0%', '5.5', '../img/articles/ejes/independent/4.jpg'),

  (25, 'WhiteShadow', 'Thunder', 'Ejes', '15,00 €', 'Trucks to ride the wind', '10%', '4.7', '../img/articles/ejes/thunder/1.jpg'),
  (26, 'GreenShadow', 'Thunder', 'Ejes', '20,00 €', 'Trucks to ride the wind', '0%', '5.5', '../img/articles/ejes/thunder/2.jpg'),
  (27, 'BlueShadow', 'Thunder', 'Ejes', '35,00 €', 'Trucks to ride the wind', '0%', '5.0', '../img/articles/ejes/thunder/3.jpg'),
  (28, 'ClassicThunder', 'Thunder', 'Ejes', '40,00 €', 'Trucks to ride the wind', '0%', '5.0', '../img/articles/ejes/thunder/4.jpg'),

  (29, 'RedBull', 'Venture', 'Ejes', '15,00 €', 'Trucks to ride for the fortune', '10%', '5.0', '../img/articles/ejes/venture/1.jpg'),
  (30, 'Original', 'Venture', 'Ejes', '15,00 €', 'Trucks to ride for the fortune', '0%', '5.0', '../img/articles/ejes/venture/2.jpg'),
  (31, 'Venture5', 'Venture', 'Ejes', '15,00 €', 'Trucks to ride for the fortune', '0%', '5.5', '../img/articles/ejes/venture/3.jpg'),
  (32, 'Venture9', 'Venture', 'Ejes', '20,00 €', 'Trucks to ride for the fortune', '0%', '5.0', '../img/articles/ejes/venture/4.jpg'),


# RUEDAS  ---------------------------
  (33, 'BlueSky', 'BD', 'Ruedas', '30,00 €', 'Table to ride the blind side of life', '10%', '50', '../img/articles/ruedas/bd/1.jpg'),
  (34, 'RedStory', 'BD', 'Ruedas', '30,00 €', 'Table to ride the blind side of life', '0%', '52', '../img/articles/ruedas/bd/2.jpg'),
  (35, 'Nautic',    'BD', 'Ruedas', '35,00 €', 'Table to ride the blind side of life', '0%', '50', '../img/articles/ruedas/bd/3.jpg'),
  (36, 'BlackReaper', 'BD', 'Ruedas', '30,00 €', 'Table to ride the blind side of life', '0%', '52', '../img/articles/ruedas/bd/4.jpg'),

  (37, 'RedSkull', 'Bones', 'Ruedas', '30,00 €', 'Table to ride the blind side of life', '10%', '54', '../img/articles/ruedas/bones/1.jpg'),
  (38, 'WhiteSkull', 'Bones', 'Ruedas', '35,00 €', 'Table to ride the blind side of life', '0%', '52', '../img/articles/ruedas/bones/2.jpg'),
  (39, 'GreenNorth', 'Bones', 'Ruedas', '15,00 €', 'Table to ride the blind side of life', '0%', '58', '../img/articles/ruedas/bones/3.jpg'),
  (40, 'BlackSkull', 'Bones', 'Ruedas', '30,00 €', 'Table to ride the blind side of life', '0%', '51', '../img/articles/ruedas/bones/4.jpg'),

  (41, 'GreenClassic', 'Ricta', 'Ruedas', '30,00 €', 'Table to ride the blind side of life', '10%', '52', '../img/articles/ruedas/ricta/1.jpg'),
  (42, 'BlueClassic', 'Ricta', 'Ruedas', '30,00 €', 'Table to ride the blind side of life', '0%', '51', '../img/articles/ruedas/ricta/2.jpg'),
  (43, 'BlackClassic', 'Ricta', 'Ruedas', '35,00 €', 'Table to ride the blind side of life', '0%', '54', '../img/articles/ruedas/ricta/3.jpg'),
  (44, 'GoldClassic', 'Ricta', 'Ruedas', '30,00 €', 'Table to ride the blind side of life', '0%', '52', '../img/articles/ruedas/ricta/4.jpg'),

  (45, 'Original', 'SpitFire', 'Ruedas', '30,00 €', 'Table to ride the blind side of life', '10%', '52', '../img/articles/ruedas/spitfire/1.jpg'),
  (46, 'F1',       'SpitFire',  'Ruedas', '35,00 €', 'Table to ride the blind side of life', '0%', '53', '../img/articles/ruedas/spitfire/2.jpg'),
  (47, 'F4',        'SpitFire',  'Ruedas', '30,00 €', 'Table to ride the blind side of life', '0%', '53', '../img/articles/ruedas/spitfire/3.jpg'),
  (48, 'OriginalBlack', 'SpitFire', 'Ruedas', '20,00 €', 'Table to ride the blind side of life', '0%', '49', '../img/articles/ruedas/spitfire/4.jpg'),


  # RODAMIENTOS  ---------------------------
  (49, 'SwissCeramics', 'Bones', 'Rodamientos', '40,00 €', 'Table to ride the blind side of life', '10%', 'ABEC9', '../img/articles/rodamientos/bones/1.jpg'),
  (50, 'Reds',          'Bones', 'Rodamientos', '15,00 €', 'Table to ride the blind side of life', '0%', 'ABEC7', '../img/articles/rodamientos/bones/2.jpg'),
  (51, 'Reds Superior', 'Bones', 'Rodamientos', '20,00 €', 'Table to ride the blind side of life', '0%', 'ABEC9', '../img/articles/rodamientos/bones/3.jpg'),

  (52, 'GirlGold', 'Girl', 'Rodamientos', '25,00 €', 'Table to ride the blind side of life', '10%', 'ABEC9', '../img/articles/rodamientos/girl/1.jpg'),
  (53, 'GirlBlue', 'Girl', 'Rodamientos', '20,00 €', 'Table to ride the blind side of life', '0%', 'ABEC9', '../img/articles/rodamientos/girl/2.jpg'),

  (54, 'Originals', 'Mosaic', 'Rodamientos', '15,00 €', 'Table to ride the blind side of life', '10%', 'ABEC7', '../img/articles/rodamientos/mosaic/1.jpg'),
  (55, 'Titanium', 'Mosaic', 'Rodamientos', '25,00 €', 'Table to ride the blind side of life', '0%', 'ABEC9', '../img/articles/rodamientos/mosaic/2.jpg'),
  (56, 'Ceramics', 'Mosaic', 'Rodamientos', '20,00 €', 'Table to ride the blind side of life', '0%', 'ABEC7', '../img/articles/rodamientos/mosaic/3.jpg'),

  (57, 'Original', 'Pig', 'Rodamientos', '25,00 €', 'Table to ride the blind side of life', '10%', 'ABEC5', '../img/articles/rodamientos/pig/1.jpg'),
  (58, 'F1',       'Pig',  'Rodamientos', '20,00 €', 'Table to ride the blind side of life', '0%', 'ABEC7', '../img/articles/rodamientos/pig/2.jpg'),
  (59, 'F4',        'Pig',  'Rodamientos', '15,00 €', 'Table to ride the blind side of life', '0%', 'ABEC9', '../img/articles/rodamientos/pig/3.jpg'),


  # ACCESORIOS  ---------------------------
  (60, 'Cera Bloque',  'Element', 'Accesorios', '15,00 €', 'Table to ride the blind side of life', '0%', 'ABEC7', '../img/articles/accesorios/element/1.jpg'),
  (61, 'TornillosHex', 'Element', 'Accesorios', '20,00 €', 'Table to ride the blind side of life', '0%', 'ABEC9', '../img/articles/accesorios/element/2.jpg'),

  (62, 'TornillosHex',      'Independent', 'Accesorios', '25,00 €', 'Table to ride the blind side of life', '10%', 'ABEC9', '../img/articles/accesorios/independent/1.jpg'),
  (63, 'TornillosPunta',    'Independent', 'Accesorios', '20,00 €', 'Table to ride the blind side of life', '0%', 'ABEC9', '../img/articles/accesorios/independent/2.jpg'),
  (64, 'TornillosHex White', 'Independent', 'Accesorios', '20,00 €', 'Table to ride the blind side of life', '0%', 'ABEC9', '../img/articles/accesorios/independent/3.jpg'),
  (65, 'Maleta Ind.-Dakine', 'Independent', 'Accesorios', '20,00 €', 'Table to ride the blind side of life', '0%', 'ABEC9', '../img/articles/accesorios/independent/4.jpg'),

  (66, 'Cera Mano',        'SantaCruz', 'Accesorios', '15,00 €', 'Table to ride the blind side of life', '10%', 'ABEC7', '../img/articles/accesorios/santacruz/1.jpg'),
  (67, 'Casco Black Santa', 'SantaCruz', 'Accesorios', '20,00 €', 'Table to ride the blind side of life', '0%', 'ABEC7', '../img/articles/accesorios/santacruz/2.jpg'),


  # TABLAS COMPLETAS  ---------------------------
  (68, 'PsicoReaper', 'Blind', 'TablasCompletas', '120,00 €', 'Table to ride the blind side of life', '10%', '50', '../img/articles/tcompletas/blind/1.jpg'),
  (69, 'HairyOk', 'Blind', 'TablasCompletas', '125,00 €', 'Table to ride the blind side of life', '0%', '52', '../img/articles/tcompletas/blind/2.jpg'),

  (70, 'MoonCobra', 'DarkStar', 'TablasCompletas', '130,00 €', 'Table to ride the dark side of life', '10%', '54', '../img/articles/tcompletas/darkstar/1.jpg'),
  (71, 'MonoBlack', 'DarkStar', 'TablasCompletas', '105,00 €', 'Table to ride the dark side of life', '0%', '52', '../img/articles/tcompletas/darkstar/2.jpg'),
  (72, 'MostPower', 'DarkStar', 'TablasCompletas', '105,00 €', 'Table to ride the dark side of life', '0%', '58', '../img/articles/tcompletas/darkstar/3.jpg'),
  (73, 'RyanDezenzo', 'DarkStar', 'TablasCompletas', '110,00 €', 'Table to ride the dark side of life', '0%', '51', '../img/articles/tcompletas/darkstar/4.jpg'),
  (74, 'GoldKnight', 'DarkStar', 'TablasCompletas', '120,00 €', 'Table to ride the dark side of life', '0%', '51', '../img/articles/tcompletas/darkstar/5.jpg'),
  (75, 'DarkKnight', 'DarkStar', 'TablasCompletas', '130,00 €', 'Table to ride the dark side of life', '0%', '51', '../img/articles/tcompletas/darkstar/6.jpg'),

  (76, 'ColorSkull', 'SpeedDemons', 'TablasCompletas', '95,00 €', 'Table to ride the furious side of life', '10%', '52', '../img/articles/tcompletas/speeddemons/1.jpg'),

  (77, 'ColorBuildings #1', 'Tricks', 'TablasCompletas', '85,00 €', 'Table to ride the tricky side of life', '10%', '52', '../img/articles/tcompletas/tricks/1.jpg'),
  (78, 'ColorBuildings #2', 'Tricks', 'TablasCompletas', '85,00 €', 'Table to ride the tricky side of life', '0%',  '53', '../img/articles/tcompletas/tricks/2.jpg');
