-- Last updated: 7/31/2025, 12:28:25 PM
SELECT Visits.customer_id, COUNT(Visits.visit_id)  as count_no_trans
from Visits 
LEFT JOIN Transactions
ON Visits.visit_id = Transactions.visit_id  
WHERE Transactions.transaction_id IS NULL 
GROUP BY Visits.customer_id; 