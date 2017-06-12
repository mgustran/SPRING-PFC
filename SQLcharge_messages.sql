CREATE TABLE IF NOT EXISTS `messages` (
  `message_id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `email` varchar(50) NOT NULL,
  `message` varchar(300) NOT NULL,
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


INSERT INTO `messages` (`message_id`, `name`, `email`, `message`) VALUES
	(1, 'Paco', 'samatao@paco.com', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus dapibus in turpis sed luctus.
	 Integer dapibus, purus sit amet viverra auctor, libero erat iaculis tortor, eu interdum ipsum augue at lacus.'),
  (2, 'Manue', 'manolo@secayo.com', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus dapibus in turpis sed luctus.
	 Integer dapibus, purus sit amet viverra auctor, libero erat iaculis tortor, eu interdum ipsum augue at lacus.'),
  (3, 'Dionisio', 'dionisio@elrumbero.com', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus dapibus in turpis sed luctus.
	 Integer dapibus, purus sit amet viverra auctor, libero erat iaculis tortor, eu interdum ipsum augue at lacus.');