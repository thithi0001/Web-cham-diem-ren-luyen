CREATE TABLE `grant_queue` (
  `Grant_id` int PRIMARY KEY AUTO_INCREMENT,
  `User_id` varchar(20) NOT NULL,
  `Role_name` varchar(20) NOT NULL,
  `Is_granted` bool DEFAULT false,
  `Created_at` timestamp DEFAULT CURRENT_TIMESTAMP
);
