CREATE TABLE IF NOT EXISTS `orders` (
  `order_id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `second_name` varchar(40) NOT NULL,
  `email` varchar(50) NOT NULL,
  `ccard` DOUBLE NOT NULL,
  `cvc` int(4) NOT NULL,
  `month_card` int(2) NOT NULL,
  `year_card` int(5) NOT NULL,
  `address` varchar(50) NOT NULL,
  `location` varchar(30) NOT NULL,
  `country` varchar(30) NOT NULL,
  `postal_code` int(7) NOT NULL,
  `quantities` VARCHAR(200) NOT NULL,
  `total_price` double NOT NULL,
  `total_tax` double NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


INSERT INTO `orders` (`order_id`, `name`, `second_name`, `email`, `ccard`, `cvc`, `month_card`, `year_card`, `address`,
											`location`, `country`, `postal_code`, `quantities`, `total_price`, `total_tax`) VALUES
	(1, 'Manel', 'Garcia', 'manel@testing.com', 2015624895483015, 246, 04, 2019, 'c/Vicens Buades nº5', 'Port de Pollença', 'España', 07470, 'DacWon/Almost - 1,  GreyClassic/Destructo - 2,  GirlGold/Girl - 1', 125, 20);