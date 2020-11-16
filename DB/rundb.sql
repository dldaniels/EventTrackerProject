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
  `name` VARCHAR(500) NULL,
  `distance` DOUBLE NULL,
  `time` DOUBLE NULL,
  `calories` INT NULL,
  `elevation_gain` VARCHAR(45) NULL,
  `date` VARCHAR(45) NULL,
  `avg_heart_rate` INT NULL,
  `location` VARCHAR(500) NULL,
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
INSERT INTO `run` (`id`, `name`, `distance`, `time`, `calories`, `elevation_gain`, `date`, `avg_heart_rate`, `location`) VALUES (1, 'Phil', 3.14, 27.49, 590, '64', '2020-11-11', 76, 'Sloans Lake');
INSERT INTO `run` (`id`, `name`, `distance`, `time`, `calories`, `elevation_gain`, `date`, `avg_heart_rate`, `location`) VALUES (2, 'Bill', 4.29, 41.32, 788, '144', '2020-11-13', 79, 'Clear Creek Trail');

COMMIT;

