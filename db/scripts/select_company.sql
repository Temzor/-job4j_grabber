SELECT pr.name "Name employe", cm.name "Name company"
FROM person pr
INNER JOIN company cm ON cm.id = pr.company_id 
WHERE cm.id != 5
ORDER BY cm.id;

SELECT cm.name "Name company", COUNT(cm.name) "Count employe"
FROM company AS cm
INNER JOIN person pr ON pr.company_id = cm.id
GROUP BY cm.name
HAVING COUNT(cm.name) = (
		SELECT COUNT(company_id)
		FROM person
		GROUP BY company_id 
	  ORDER BY company_id DESC
		LIMIT 1
);

