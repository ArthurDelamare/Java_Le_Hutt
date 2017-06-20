DELIMITER |

CREATE PROCEDURE CallMap

(IN ID INT(2), OUT content varchar(250000) )

BEGIN
	SELECT content_map INTO content
	FROM maps 
	WHERE id_map = ID;
END |
DELIMITER ;

/* 
Exemple d'appel :

CALL CallMap(1);

*/