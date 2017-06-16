DELIMITER |

CREATE PROCEDURE CallMap

(IN ID INT(2)) 

BEGIN
	SELECT content_map AS "Map Content"
	FROM maps 
	WHERE id_map = ID;
END |
DELIMITER ;

/* 
Exemple d'appel :

CALL CallMap(1);

*/