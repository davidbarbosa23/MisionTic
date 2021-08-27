SELECT 'Consulta 1';
SELECT `nombre`, `precio` FROM `producto` ORDER BY `nombre` ASC;
SELECT 'Consulta 2';
SELECT `nombre`, `edad` FROM `empleado` WHERE `edad` > 25;
SELECT 'Consulta 3';
SELECT `producto`.`nombre` AS `nombre` 
    FROM `almacena` 
    JOIN `producto` 
    ON `almacena`.`idproducto` = `producto`.`idproducto` 
    WHERE `almacena`.`idBodega` = (SELECT `idBodega` FROM `Bodega` WHERE `nombre` = "santa isabel");
SELECT 'Consulta 4';
SELECT `producto`.`nombre` AS `nombre`, `producto`.`precio` AS `precio` 
    FROM `almacena` JOIN `producto` ON `almacena`.`idproducto` = `producto`.`idproducto` 
    WHERE `almacena`.`idBodega` = (SELECT `idBodega` FROM `empleado` WHERE `nombre` = "Ferdinand Dixon") 
    ORDER BY `nombre` ASC;
SELECT 'Consulta 5';
SELECT `empleado`.`nombre` AS `nombre`, `empleado`.`edad` AS `edad`  
    FROM `empleado` 
    JOIN `Bodega` ON `empleado`.`idBodega` = `Bodega`.`idBodega` 
    JOIN `almacena` ON `Bodega`.`idBodega` = `almacena`.`idBodega` 
    WHERE `almacena`.`idproducto` = (SELECT `idproducto` FROM `producto` WHERE `nombre` = "vino espumoso") 
    ORDER BY `nombre` ASC;
SELECT 'Consulta 6';
SELECT count(*) AS `cantidad` FROM `producto` WHERE `precio` > 50000;