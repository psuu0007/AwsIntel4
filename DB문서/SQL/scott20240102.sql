--축구 선수들 중
--소속이 삼성블루윙즈인 선수들이면서
--키가 170 이상인 선수들을 찾으시오
--선수명,    포지션,	키

SELECT *
FROM BONUS;

SELECT *
FROM DEPT;

--자료, 데이터 조사
SELECT *
FROM PLAYER;

SELECT *
FROM TEAM;

DESC PLAYER;

--축구 선수들 중
--소속이 삼성블루윙즈인 선수들이면서
--키가 170 이상인 선수들을 찾으시오
--선수명,    포지션,	키

SELECT PLAYER_NAME 선수명, POSITION 포지션, HEIGHT 키
FROM PLAYER
WHERE TEAM_ID = 'K02'
AND height >= 170;

--결과
--가독성
--효율성
--3가지
select team_id 팀ID , player_name 선수명 , position 포지션 , back_no 백넘버 , height 키
from player
where team_id = 'K02' or team_id = 'K07'
AND position = 'MF' 
AND height >= 170 AND height <= 180;

select team_id 팀ID , player_name 선수명 , position 포지션 , back_no 백넘버 , height 키
from player
where (team_id = 'K02' or team_id = 'K07') 
AND position = 'MF' 
AND (height >= 170 AND height <= 180);

select team_id 팀ID , player_name 선수명 , position 포지션 , back_no 백넘버 , height 키
from player
where (team_id = 'K02' or team_id = 'K07') 
AND position = 'MF' 
AND height >= 170 AND height <= 180;


SELECT *
FROM EMP
WHERE SAL BETWEEN 2000 AND 3000;

--사전식

SELECT *
FROM EMP
WHERE NOT (SAL < 2000
OR SAL > 3000);


SELECT *
FROM EMP
WHERE NOT SAL BETWEEN 2000 AND 3000;


SELECT *
FROM EMP
WHERE COMM = 300 
OR COMM = 500; 

SELECT *
FROM EMP
WHERE COMM IN(300, 500, 1400);

SELECT *
FROM EMP;

--지금 같은 결과가 나온 경우를 공집합 형태라고 한다
--공집합은 오류가 아니다
SELECT *
FROM EMP
WHERE ENAME = 'F';

SELECT *
FROM EMP
WHERE ENAME LIKE 'F%';

SELECT *
FROM EMP
WHERE ENAME LIKE '%';

SELECT *
FROM EMP
WHERE ENAME LIKE '_M%';

SELECT *
FROM EMP
WHERE ENAME LIKE '_M___';

DESC EMP;


-- 5.이름에 M과 I를 둘 다 포함하고 있는 직원들을 검색
--   사원번호      사원명	부서번호
SELECT empno 사원번호, ename 사원명, deptno 부서번호
FROM EMP
WHERE ENAME  LIKE '%M%' 
AND ENAME LIKE '%I%';   

--중첩?
SELECT empno 사원번호, ename 사원명, deptno 부서번호
FROM EMP
WHERE ENAME  LIKE '%M%I%'    
or ENAME LIKE '%I%M%';     




--1 이 방식이 표준이다
SELECT *
FROM EMP
WHERE not ENAME LIKE '%\%%';

--2 
SELECT *
FROM EMP
WHERE ENAME not LIKE '%\%%';

select *
from emp;

SELECT *
FROM EMP
WHERE ENAME LIKE '%';

SELECT *
FROM EMP
WHERE ENAME LIKE '%\%%' ESCAPE '\';

SELECT *
FROM EMP;

SELECT *
FROM EMP
WHERE COMM = NULL;

SELECT *
FROM EMP
WHERE COMM IS NULL;

-- 이게 표준이다
SELECT *
FROM EMP
WHERE COMM IS NOT NULL;

SELECT *
FROM EMP
WHERE NOT COMM IS NULL;

-- 유빈
SELECT player_name, position, team_id, height, back_no
FROM player
where team_id='K02'
and position <> 'MF'
and (not height>=175 or not height<=185);

SELECT player_name 선수명, position 포지션, team_id 팀ID, height ||'CM' 키, back_no 백넘버
FROM player
WHERE team_id = 'K02'
AND position <> 'MF'
AND NOT (height >=175 AND height <=185);

select PLAYER_NAME 선수명, POSITION 포지션, TEAM_ID 팀ID, height || 'CM' 키,BACK_NO 백넘버
from player
where  team_id LIKE 'K02' 
and not position LIKE 'MF' 
and position is not NULL 
and not height BETWEEN 175 and 185;



SELECT ENAME, 24 * 60
FROM EMP;

SELECT ROUND(3.1415, 2)
FROM DEPT;

--확인, 검증?

SELECT 24 * 60
FROM DUAL;

DESC DUAL;

SELECT *
FROM DUAL;


--숫자형 함수
SELECT ABS(-15) 절대값, ROUND(38.5235, 0), ROUND(380.5235, -2), FLOOR(34.5678)
FROM DUAL;

SELECT 34.5678, TRUNC(34.5678), TRUNC(34.5678, 2), TRUNC(34.5678, -1)
FROM DUAL;

--나머지 연산자
SELECT MOD(27, 2), MOD(27, 5), CEIL(38.123)
FROM DUAL;

------------------------------------

--문자형 함수
--문자를 입력하면 문자나 숫자 값을 반환한다

SELECT 'Welcome to Oracle', Upper('Welcome to Oracle')
FROM DUAL;

SELECT 'Welcome to Oracle', Lower('Welcome to Oracle')
FROM DUAL;

SELECT 'Welcome to Oracle', LENGTH('Welcome to Oracle')
FROM DUAL;

SELECT 'Oracle', LENGTH('오라클'), LENGTHB('오라클'), lengthb('Oracle')
FROM DUAL;



SELECT 'Welcome to Oracle', substr('Welcome to Oracle', 4, 3), substr('Welcome to Oracle', 1, 3)
    , substr('Welcome to Oracle', -4, 3)
FROM DUAL;



