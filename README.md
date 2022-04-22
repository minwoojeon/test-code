
### 테스트 세팅 방법

- 설치해야하는 프로그램 : docker, 스프링 프로젝트를 빌드할 IDE(IDE 돌리려면 자바라던가 필요)

- 컨테이너 실행 명령 (기본 제공 스키마용)
  ```command shell
  docker-compose -f ./docker-compose-local.yml up -d
  ```

- spring-boot 프로젝트 실행에 추가 파라미터 (IDE 에 추가하시거나 빌드시 추가해서 빌드해야함)
  ```
  -Dspring.profiles.active="local" -Dfile.encoding=UTF-8
  ```

### Source spec

- 비어 있고, 몽고로 이루어진 sample doc 이 하나 존재.

- Copyrighted by marvrus.
