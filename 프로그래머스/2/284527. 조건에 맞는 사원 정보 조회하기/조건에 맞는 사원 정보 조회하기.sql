SELECT SUM(SCORE) AS SCORE, A.EMP_NO, EMP_NAME, POSITION, EMAIL
FROM HR_EMPLOYEES AS A
    JOIN HR_GRADE AS B
    USING (EMP_NO)
GROUP BY EMP_NO
HAVING SCORE = (SELECT MAX(SCORE) FROM (
    SELECT EMP_NO, SUM(SCORE) AS SCORE
    FROM HR_GRADE
    GROUP BY EMP_NO
    ) AS T
);