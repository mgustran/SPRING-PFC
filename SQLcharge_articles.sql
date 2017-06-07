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
	(1, 'ElektroRide x1', 'Thunder', 'Trucks', '20,99', 'fuck the system ma man', '5%', '5p', 'img'),
	(2, 'BlackPearl', 'BD SkateCO', 'Wheels', '34,63', 'fuck the system ma man 2', '4%', '54p', 'img2' ),
	(3, 'BBlack Edition', 'Bones', 'Bearings', '12,45', 'fuck the system ma man 3', '2%', 'ABEC7', 'img3'); 