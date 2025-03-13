select d.dname
from emp e inner join dept d
on e.deptno = d.deptno
where e.ename = 'SMITH';

--메인 쿼리?
select dname
from dept
where deptno = (select deptno       --서브 쿼리?
                from emp
                where ename = 'SMITH');
                
select dname
from dept
where deptno = 20;


select deptno       --서브 쿼리?
from emp
where ename = 'SMITH';


--연봉을 3000 이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는
--사원들의 정보를 출력
SELECT ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO = ( SELECT DEPTNO
                 FROM EMP
                 WHERE SAL >= 3000
                 AND DEPTNO IS NOT NULL);

SELECT *
FROM EMP;

SELECT DEPTNO
FROM EMP
WHERE SAL >= 3000;

SELECT ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO = ( SELECT DEPTNO
                 FROM EMP
                 WHERE SAL >= 3000);
                 
SELECT ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO IN ( SELECT DEPTNO
                 FROM EMP
                 WHERE SAL >= 3000);
      
      
SELECT E.DEPTNO 부서번호, E.ENAME 사원명, E.JOB 직급, E.SAL 급여
FROM EMP E
WHERE SAL IN (SELECT MAX(SAL)
              FROM EMP
              WHERE DEPTNO IS NOT NULL
              GROUP BY DEPTNO)
ORDER BY E.DEPTNO DESC;      
      
      
      
-- 다중 컬럼 서브쿼리                 
SELECT DEPTNO, ENAME, JOB, SAL
FROM EMP
WHERE (DEPTNO, SAL) IN (SELECT DEPTNO, MAX(SAL)
                        FROM EMP
                        GROUP BY DEPTNO);


SELECT DEPTNO, MAX(SAL)
FROM EMP
GROUP BY DEPTNO;


SELECT MAX(SAL)
FROM EMP
GROUP BY DEPTNO
HAVING DEPTNO = 30;

SELECT ENAME, SAL
FROM EMP
WHERE SAL > (SELECT MAX(SAL)
            FROM EMP
            GROUP BY DEPTNO
            HAVING DEPTNO = 30);
            
SELECT SAL
FROM EMP
WHERE DEPTNO = 30;

SELECT ENAME, SAL
FROM EMP
WHERE SAL > ALL(SELECT SAL
            FROM EMP
            WHERE DEPTNO = 30);

------------------------------

SELECT ENAME, SAL
FROM EMP
WHERE SAL > (SELECT MIN(SAL)
            FROM EMP
            GROUP BY DEPTNO
            HAVING DEPTNO = 30);

SELECT ENAME, SAL
FROM EMP
WHERE SAL > (SELECT SAL
            FROM EMP
            WHERE DEPTNO = 30);

SELECT ENAME, SAL
FROM EMP
WHERE SAL > ANY(SELECT SAL
            FROM EMP
            WHERE DEPTNO = 30);     
            


SELECT *
FROM EMP;

SELECT ENAME, SAL
FROM EMP
WHERE SAL > ALL (SELECT SAL
                 FROM EMP
                 WHERE JOB = 'SALESMAN')
AND DEPTNO <> 20;



--4
--영업 사원들보다 급여를 많이 받는 사원들의 이름과 급여를 출력하되
--3000원 미만의 직원들은 출력하지 마시오
--사원명      급여   

SELECT eNAME 사원명, SAL 급여
FROM EMP
WHERE NOT SAL < 3000
AND SAL > ALL(SELECT SAL
              FROM EMP
              WHERE JOB = 'SALESMAN');

SELECT eNAME 사원명, SAL 급여
FROM EMP
WHERE NOT SAL < 3000
AND SAL > (SELECT MAX(SAL)
              FROM EMP
              WHERE JOB = 'SALESMAN');
              
             
SELECT P.TEAM_ID, P.PLAYER_NAME, P.HEIGHT, (SELECT AVG(HEIGHT)
                                            FROM PLAYER X
                                            WHERE X.TEAM_ID = P.TEAM_ID) "소속팀의 평균키"
FROM PLAYER P
ORDER BY P.TEAM_ID;

SELECT AVG(HEIGHT)
FROM PLAYER X
WHERE X.TEAM_ID = P.TEAM_ID;


--조인 VS 서브쿼리 VS 인라인 뷰
SELECT *
FROM EMP;


DESC EMP;


SELECT EMPNO, ENAME, SAL, SAL * 12
FROM EMP;

--인라인 뷰
SELECT *
FROM (  SELECT EMPNO, ENAME, SAL, SAL * 12
        FROM EMP);

SELECT *
FROM (  SELECT EMPNO, ENAME, SAL, SAL * 12 AS SAL_ANNUAL
        FROM EMP
        WHERE DEPTNO = 10);
        
-------------------
--인라인 뷰 설명
DROP TABLE SAL12;
CREATE TABLE SAL12
AS
SELECT EMPNO, ENAME, SAL, SAL * 12 SAL12
FROM EMP
WHERE DEPTNO = 10;


ALTER TABLE SAL12
ADD SAL12 NUMBER(8,2);

UPDATE SAL12
SET SAL12 = SAL*12;

SELECT *
FROM SAL12;

DESC SAL12;



