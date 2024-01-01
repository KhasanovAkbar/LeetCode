/*Input:
MyNumbers table:
+-----+
| num |
+-----+
| 8   |
| 8   |
| 3   |
| 3   |
| 1   |
| 4   |
| 5   |
| 6   |
+-----+
Output:
+-----+
| num |
+-----+
| 6   |
+-----+*/

select  max(num) as nums
from (
    select num from MyNumbers
               group by num
               having count(*) =1
     ) as SingleNumbers;
