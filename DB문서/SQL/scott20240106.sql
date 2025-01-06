--문자형을 날짜형으로 변환하는 to_date 함수

SELECT *
FROM EMP;

DESC EMP;

select ENAME, HIREDATE
FROM EMP
WHERE HIREDATE = 19801217;

select ENAME, HIREDATE
FROM EMP
WHERE HIREDATE = '19801217'; --자동 형변환 오라클만?

select ENAME, HIREDATE
FROM EMP
WHERE HIREDATE = TO_DATE(19801217, 'YYYYMMDD');

select ENAME, HIREDATE
FROM EMP
WHERE HIREDATE = TO_DATE('19801217', 'YYYYMMDD');

SELECT SySDATE - '1980/12/17'
FROM DUAL;

SELECT SySDATE - TO_DATE('1980/12/17', 'YYYY/MM/DD')
FROM DUAL;

SELECT SYSDATE 현재날짜, TO_DATE('2025-01-05', 'YYYY-MM-DD') 수동
FROM DUAL;


SELECT ENAME, hiredate, TRUNC(SYSDATE - HIREDATE) 근무일수, TRUNC(SYSDATE - HIREDATE) / 365
FROM EMP;

--증명
SELECT TO_DATE('20250106 11:50:00', 'YYYYMMDD HH:MI:SS') - TO_DATE('20240106 11:50:00', 'YYYYMMDD HH:MI:SS')
FROM DUAL;

SELECT (TO_DATE('20250106 11:50:00', 'YYYYMMDD HH:MI:SS') - TO_DATE('20240106 11:50:00', 'YYYYMMDD HH:MI:SS'))/365
FROM DUAL;

SELECT CEIL(((TO_DATE('20250106 11:50:00', 'YYYYMMDD HH:MI:SS') - TO_DATE('20240106 11:50:00', 'YYYYMMDD HH:MI:SS'))-1)/365)
FROM DUAL;

select to_date('1989/10/13 06:00:00', 'yyyy/mm/dd hh24:mi:ss') "자신의 생년월일"
    , floor((sysdate-to_date('1989/10/13 06:00:00', 'yyyy/mm/dd hh24:mi:ss'))/365) "(만)나이"
from dual;
                                
SELECT to_date('1989/10/13 06:00:00', 'yyyy/mm/dd hh24:mi:ss') "날짜형 -> 문자형"
FROM DUAL;

SELECT TO_CHAR(TO_DATE('1989/10/13','YYYY-MM-DD'),'YYYY')||'년'||
    TO_CHAR(TO_DATE('1989/10/13','YYYY-MM-DD'),'MM')||'월'||
    TO_CHAR(TO_DATE('1989/10/13','YYYY-MM-DD'),'DD')||'일'||
    TO_CHAR(' 06:00:00') "자신의 생년월일", 
    FLOOR((SYSDATE-TO_DATE('1989/10/13', 'yyyy/mm/dd'))/365) "(만)나이"
FROM DUAL;

SELECT TO_CHAR(TO_DATE('1989/10/13 12:24:30','YYYY-MM-DD HH24:MI:SS')
    ,'YYYY"년"MM"월"DD"일" HH24:MI:SS') "자신의 생년월일"
FROM DUAL;

SELECT ENAME, HIREDATE, TO_CHAR(HIREDATE, 'HH24:MI:SS') 시분초
FROM EMP;

SELECT DEPTNO, DECODE(DEPTNO,   10, 'ACCOUNTING',
                                20, 'RESEARCH', 
                                'DEFAULT') DNAME
FROM EMP;

SELECT *
FROM DEPT;

SELECT ENAME, DEPTNO,
    CASE    WHEN DEPTNO = 10 THEN 'ACCOUNTING'
            WHEN DEPTNO = 20 THEN 'RESEARCH'
            WHEN DEPTNO = 30 THEN 'SALES'
            WHEN DEPTNO = 40 THEN 'OPERATIONS'
    END AS DNAME
FROM EMP;

SELECT LOC,
    CASE  LOC  
        WHEN 'NEW YORK'  THEN 'EAST'
        WHEN  'DALLAS' THEN 'EAST'
        WHEN  'CHICAGO' THEN 'CENTER'
        WHEN  'BOSTON' THEN 'CENTER'
        ELSE 'ETC'
    END AREA
FROM DEPT;

SELECT *
FROM PLAYER;


SELECT ENAME, SAL,
    CASE WHEN SAL>=2000 THEN 1000
         ELSE (
            CASE    WHEN SAL>=1000 
                    THEN 500
                    ELSE 0
            END)
    END BONUS
FROM EMP;

-- NULL을 다른 값으로 변환하는 함수
--NVL(표현식1, 표현식2): 표현식1의 결과값이 NULL이면 표현식2의 값을 출력한다
--단, 표현식1과 표현식2의 결과 데이터 타입이 같아야 한다

SELECT NVL(NULL, '널을 다른 값으로 변경'), NULL, NVL('값', '널을 다른 값으로 변경')
FROM DUAL;

SELECT player_name, POSITION, NVL(POSITION, '없음') POSITION
FROM PLAYER;


--그룹 함수 OR 집계 함수(Aggregate function)
SELECT COUNT(HEIGHT), MAX(HEIGHT), MIN(HEIGHT), AVG(HEIGHT) 평균키
FROM PLAYER;

SELECT DEPTNO, ROUND(SAL, -3)
FROM EMP;

SELECT SUM(SAL) "사원의 총 급여"
FROM EMP;

SELECT COUNT(EMPNO), COUNT(COMM)
FROM EMP;

SELECT *
FROM EMP;

SELECT *
FROM PLAYER;

--각 부서 사원들의 평균 급여를 구하시오
SELECT DEPTNO, AVG(SAL)
FROM EMP;

SELECT AVG(SAL)
FROM EMP;

SELECT DEPTNO
FROM EMP;

SELECT DEPTNO, AVG(SAL)
FROM EMP
GROUP BY DEPTNO;

SELECT *
FROM EMP;

-- HAVING절 GROUP에 대한 조건문
--부서번호별 급여 평균이 2000 이상인 부서만 출력
SELECT DEPTNO, AVG(SAL)
FROM EMP
GROUP BY DEPTNO
HAVING AVG(SAL) >= 2000;

--SELECT DEPTNO, AVG(SAL)
--FROM EMP
--GROUP BY DEPTNO
--WHERE AVG(SAL) >= 2000;

