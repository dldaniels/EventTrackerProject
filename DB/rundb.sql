-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema runDB
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `runDB` ;

-- -----------------------------------------------------
-- Schema runDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `runDB` DEFAULT CHARACTER SET utf8 ;
USE `runDB` ;

-- -----------------------------------------------------
-- Table `run`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `run` ;

CREATE TABLE IF NOT EXISTS `run` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `distance` DOUBLE NULL,
  `time` DOUBLE NULL,
  `calories` INT NULL,
  `elevation_gain` VARCHAR(45) NULL,
  `date` VARCHAR(45) NULL,
  `avg_heart_rate` INT NULL,
  `location` VARCHAR(500) NULL,
  `description` VARCHAR(21000) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS run@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'run'@'localhost' IDENTIFIED BY 'run';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'run'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `run`
-- -----------------------------------------------------
START TRANSACTION;
USE `runDB`;
INSERT INTO `run` (`id`, `distance`, `time`, `calories`, `elevation_gain`, `date`, `avg_heart_rate`, `location`, `description`) VALUES (1, 3.74, 39.49, 560, '180', '2020-11-1', 153, 'Clear Creek Trail', 'Light jog through the park, felt awesome.');
INSERT INTO `run` (`id`, `distance`, `time`, `calories`, `elevation_gain`, `date`, `avg_heart_rate`, `location`, `description`) VALUES (2, 4.29, 41.32, 788, '144', '2020-11-13', 144, 'Clear Creek Trail', 'Moderate pace along trail from Wadworth blvd to Youngfield St. felt pretty rough.');
INSERT INTO `run` (`id`, `distance`, `time`, `calories`, `elevation_gain`, `date`, `avg_heart_rate`, `location`, `description`) VALUES (3, 5.63, 48.22, 699, '180', '2020-11-3', 149, 'Sloans Lake', 'Struggle bus, legs were sore the whole time');
INSERT INTO `run` (`id`, `distance`, `time`, `calories`, `elevation_gain`, `date`, `avg_heart_rate`, `location`, `description`) VALUES (4, 3.14, 27.22, 432, '72', '2020-11-5', 167, 'Berkely Park', 'Good 5K pace felt great');
INSERT INTO `run` (`id`, `distance`, `time`, `calories`, `elevation_gain`, `date`, `avg_heart_rate`, `location`, `description`) VALUES (5, 4.38, 36.19, 588, '122', '2020-11-7', 162, 'Sloans lake', 'Sloans lake is too packed to get really fast but still fun');
INSERT INTO `run` (`id`, `distance`, `time`, `calories`, `elevation_gain`, `date`, `avg_heart_rate`, `location`, `description`) VALUES (6, 3.22, 39.12, 422, '29', '2020-11-9', 144, 'Clear Creek Trail/Golden', 'Slow run with the dog');
INSERT INTO `run` (`id`, `distance`, `time`, `calories`, `elevation_gain`, `date`, `avg_heart_rate`, `location`, `description`) VALUES (7, 2.00, 18.12, 544, '12', '2020-11-11', 166, 'Wheat Ridge High School Track', 'Sprint Intervals');
INSERT INTO `run` (`id`, `distance`, `time`, `calories`, `elevation_gain`, `date`, `avg_heart_rate`, `location`, `description`) VALUES (8, 5.00, 52.32, 922, '345', '2020-11-13', 172, 'Wheat Ridge', 'Road run through Wheatridge Bel Aire neighborhood');

COMMIT;

