system 에서 수행
--오라클 계정 생성
CREATE USER apple IDENTIFIED BY apple12 account unlock;


--권한 부여
GRANT CONNECT, RESOURCE TO apple;