SELECT COUNT(*) AS FISH_COUNT
FROM FISH_INFO AS A
    JOIN FISH_NAME_INFO AS B
    ON A.FISH_TYPE = B.FISH_TYPE
WHERE B.FISH_NAME IN ('BASS', 'SNAPPER');