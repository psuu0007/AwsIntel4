--계정 생성
CREATE USER aws
IDENTIFIED BY aws12;

--권한 부여
--         권한명 to 대상계정
GRANT CREATE SESSION TO aws;

--권한 회수
--      권한명 from    대상계정
REVOKE CREATE SESSION from aws;

--권한 조회
--SELECT *
--FROM USER_TAB_PRIVS_MADE; 이게 아닌가벼
SELECT * FROM USER_SYS_PRIVS;


--roll 권한들의 묶음

grant CONNECT, RESOURCE to aws;

