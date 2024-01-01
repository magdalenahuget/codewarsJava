-- # write your SQL statement here: you are given a table 'ntheven' with column 'n',
-- return a table with column 'n' and your result in a column named 'res'.
SELECT
    n AS n,
    2 * (N - 1) AS res
FROM
    ntheven
WHERE
       n > 0;