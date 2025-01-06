SELECT *
FROM PLAYER;

SELECT *
FROM EMP;

DESC EMP;

select empno, ename, job
from emp;

SELECT EMPNO, ENAME, JOB, HIREDATE
FROM EMP;

SELECT *
FROM DEPT;

SELECT DNAME
FROM DEPT;

SELECT *
FROM PLAYER;

SELECT ALL POSITION
FROM PLAYER;

SELECT POSITION
FROM PLAYER;

SELECT DISTINCT POSITION
FROM PLAYER;

SELECT EMPNO, SAL, SAL * 1000, NULL + 100, COMM + 2200
FROM EMP;


SELECT *
FROM EMP;

SELECT ENAME, SAL
FROM EMP;

-- SDFDSFDSF
SELECT hiredaTE, deptno, job
FROM EMP;


SELECT ENAME, SAL, SAL + 100, SAL - 100, (SAL + 100) * -1
FROM EMP;

SELECT ENAME, ROUND(SAL / 3, 2)
FROM EMP;

SELECT player_name, ROUND(WEIGHT/((HEIGHT/100) * (height/100)), 2)
FROM PLAYER;

SELECT player_name AS 선수명, ROUND(WEIGHT/((HEIGHT/100) * (height/100)), 2) BMI비만지수
FROM PLAYER;

SELECT DNAME, DNAME as 부서명, dname 부서이름, dname "부서 이름", dname "!!신기하네", dname "DnameChk"
FROM DEPT;


select *
FROM EMP;

SELECT ENAME, 'IS A ', JOB 
FROM EMP;

SELECT ENAME + 'IS A ' + JOB 
FROM EMP;

SELECT ENAME || ' IS A ' || JOB 자기소개
FROM EMP;


-- 사원들 중에서 사원번호, 사원명, 급여를 검색하시오
select empno, ename, sal
from emp;

-- 급여를 3000 이상 받는 사원에 대해 출력하시오
select empno, ename, sal
from emp
where sal >= 3000;

select empno, ename, sal
from emp
where sal = 3000;


--다르다 연산자
--비표준
select empno, ename, sal
from emp
where sal != 3000;

--비표준
select empno, ename, sal
from emp
where sal ^= 3000;

--이것만 사용한다**** 표준
select empno, ename, sal
from emp
where sal <> 3000;       

SELECT * 
FROM emp;

select empno, ename, sal
from emp
where ename = smith;

select empno, ename, sal
from emp
where ename = 'smith';

select empno, ename, sal
from emp
where ename <> 'SMITH';

SELECT *
FROM DEPT;

SELECT *
FROM EMP;


--논리연산자
SELECT *   --3  모든컬럼을 출력
FROM EMP -- 1 사원테이블에서 
WHERE DEPTNO = 10  --2 부서번호가 10 이고 JOB이 매니저인 
AND JOB = 'MANAGER';

SELECT * -- 모든컬럼
FROM EMP --1 사원테이블에서
WHERE DEPTNO = 10 --2부서번호가 10 이거나 
OR JOB = 'MANAGER';--직급이 매니저인

SELECT * --3 모든 컬럼을 출력하시오
FROM EMP -- 1 사원테이블에서
WHERE NOT DEPTNO = 10; --2 부서번호가 10이 아닌


