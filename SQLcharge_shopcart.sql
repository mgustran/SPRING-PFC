CREATE TABLE IF NOT EXISTS `cart` (
  `article_id` int(5) NOT NULL AUTO_INCREMENT,
  `model` varchar(200) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `category` varchar(100) NOT NULL,
  `price` varchar(10) NOT NULL,
  `description` varchar(400) NOT NULL,
  `discount` varchar(10) NOT NULL,
  `talla` varchar(20) NOT NULL,
  `img` varchar(100) NOT NULL,
  `quantity` int(5) NOT NULL,

  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


INSERT INTO `cart` (`article_id`, `model`, `marca`, `category`, `price`, `description`, `discount`, `talla`, `img`, `quantity`) VALUES

  #   TABLAS  ------------------------
  (1, 'Haslam', 'Almost', 'Tablas', '35,00 €', 'Table to ride the sky .Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tempor ante eget faucibus congue. Phasellus urna neque, consequat non eros id, volutpat feugiat mi. Pellentesque imperdiet dui ante. Donec tortor massa, finibus iaculis suscipit sit amet, suscipit eget erat.', '5%', '8.1', '../img/articles/tablas/almost/1.jpg', 1),
  (2, 'Youness', 'Almost', 'Tablas', '30,00 €', 'Table to ride the sky .Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tempor ante eget faucibus congue. Phasellus urna neque, consequat non eros id, volutpat feugiat mi. Pellentesque imperdiet dui ante. Donec tortor massa, finibus iaculis suscipit sit amet, suscipit eget erat.', '0%', '8', '../img/articles/tablas/almost/2.jpg', 1),
  (3, 'DacWon', 'Almost', 'Tablas', '25,00 €', 'Table to ride the sky .Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tempor ante eget faucibus congue. Phasellus urna neque, consequat non eros id, volutpat feugiat mi. Pellentesque imperdiet dui ante. Donec tortor massa, finibus iaculis suscipit sit amet, suscipit eget erat.', '8%', '8.1', '../img/articles/tablas/almost/3.jpg', 1),
  (4, 'Demons', 'Almost', 'Tablas', '30,00 €', 'Table to ride the sky .Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tempor ante eget faucibus congue. Phasellus urna neque, consequat non eros id, volutpat feugiat mi. Pellentesque imperdiet dui ante. Donec tortor massa, finibus iaculis suscipit sit amet, suscipit eget erat.', '0%', '7.9', '../img/articles/tablas/almost/4.jpg', 2);
