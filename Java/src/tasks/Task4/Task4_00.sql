-- MySQL Script generated by MySQL Workbench
-- Fri Aug 27 07:43:15 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Task4
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Task4` ;

-- -----------------------------------------------------
-- Schema Task4
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Task4` DEFAULT CHARACTER SET utf8 ;
USE `Task4` ;

-- -----------------------------------------------------
-- Table `Task4`.`Bodega`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Task4`.`Bodega` ;

CREATE TABLE IF NOT EXISTS `Task4`.`Bodega` (
  `idBodega` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idBodega`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Task4`.`producto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Task4`.`producto` ;

CREATE TABLE IF NOT EXISTS `Task4`.`producto` (
  `idproducto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `precio` DECIMAL(8,2) NOT NULL,
  PRIMARY KEY (`idproducto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Task4`.`almacena`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Task4`.`almacena` ;

CREATE TABLE IF NOT EXISTS `Task4`.`almacena` (
  `idBodega` INT NOT NULL,
  `idproducto` INT NOT NULL,
  `cantidad` INT NOT NULL,
  PRIMARY KEY (`idBodega`, `idproducto`),
  INDEX `fk_Bodega_has_Producto_Producto1_idx` (`idproducto` ASC) VISIBLE,
  INDEX `fk_Bodega_has_Producto_Bodega_idx` (`idBodega` ASC) VISIBLE,
  CONSTRAINT `fk_Bodega_has_Producto_Bodega`
    FOREIGN KEY (`idBodega`)
    REFERENCES `Task4`.`Bodega` (`idBodega`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Bodega_has_Producto_Producto1`
    FOREIGN KEY (`idproducto`)
    REFERENCES `Task4`.`producto` (`idproducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Task4`.`empleado`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Task4`.`empleado` ;

CREATE TABLE IF NOT EXISTS `Task4`.`empleado` (
  `idBodega` INT NOT NULL,
  `idempleado` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `edad` INT NOT NULL,
  PRIMARY KEY (`idempleado`),
  INDEX `fk_empleado_Bodega1_idx` (`idBodega` ASC) VISIBLE,
  CONSTRAINT `fk_empleado_Bodega1`
    FOREIGN KEY (`idBodega`)
    REFERENCES `Task4`.`Bodega` (`idBodega`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;