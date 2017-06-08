CREATE TABLE IF NOT EXISTS `cart` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `article_id` int(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


INSERT INTO `cart` (`id`, `article_id`) VALUES
	(1, 4),
	(2, 7 ),
	(3, 24);