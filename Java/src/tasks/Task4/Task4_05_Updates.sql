-- Submitted:
UPDATE `producto` SET `precio` = 45000 WHERE `nombre` = "arroz";
UPDATE `empleado` SET `edad` = 25 WHERE `nombre` = "Abraham Shepherd";
DELETE FROM `almacena` WHERE `idproducto` = (SELECT `idproducto` FROM `producto` WHERE `nombre` = "champagne") AND `idBodega` = (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia");

-- Should be:
SET SQL_SAFE_UPDATES=0;
UPDATE `producto` SET `precio` = 45000 WHERE `nombre` = "arroz";
UPDATE `empleado` SET `edad` = 25 WHERE `nombre` = "Abraham Shepherd";
DELETE FROM `almacena` WHERE `idproducto` = (SELECT `idproducto` FROM `producto` WHERE `nombre` = "champagne") AND `idBodega` = (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa cecilia");
SET SQL_SAFE_UPDATES=1;