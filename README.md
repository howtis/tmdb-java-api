# Java TMDB API

**tmdb-java-api**: 자바로 개발된 라이브러리로, 영화 프로젝트를 위해 The Movie Database (TMDb) API와 통신하여 영화 정보를 검색하고 제공하는 라이브러리입니다.

<br>

## 영화 프로젝트 구조

- **<a href="https://github.com/howtis/movie-frontend" target="_blank">movie-frontend</a>**:
Vue 3 웹 프론트엔드 애플리케이션입니다. 영화 정보를 검색하고 표시하는 사용자 인터페이스를 제공합니다.

- **<a href="https://github.com/howtis/movie-backend" target="_blank">movie-backend</a>**:
Spring Boot 백엔드 애플리케이션입니다. 프론트엔드와 TMDb API, DB 간의 통신을 담당하여 데이터를 저장 및 프론트엔드로 제공합니다.

- **<a href="https://github.com/howtis/movie-helm-chart" target="_blank">movie-helm-chart</a>**:
Kubernetes에서 영화 프로젝트를 배포하기 위한 Helm Chart입니다.

<br>

## 설치 방법
gradle: 
```
repositories {
    mavenCentral()
    maven { url "https://jitpack.io" }
}
dependencies {
    implementation 'com.github.howtis:tmdb-java-api:master-SNAPSHOT'
}
```

maven: 
```
<repositories>
  <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
    <groupId>com.github.howtis</groupId>
    <artifactId>tmdb-java-api</artifactId>
    <version>master-SNAPSHOT</version>
</dependency>
```

<br>

## 사용 예시
TmdbApiClientFactory 팩토리 메서드를 통해 TmdbApiRestClient 클라이언트 클래스를 인스턴스화 하여 사용합니다.
```
TmdbApiClientFactory factory = TmdbApiClientFactory.newInstance("API_ACCESS_TOKEN");
TmdbApiRestClient tmdbApiRestClient = factory.newRestClient();
```
사용하기 위해 TMDb 가입 후 API key, token 발급이 필요합니다. https://www.themoviedb.org/

<br>

```
tmdbApiRestClient.setLanguage("ko"); // ISO 639-1 code
tmdbApiRestClient.setRegion("KR"); // ISO 3166-1 code

// https://developer.themoviedb.org/reference/movie-release-dates
tmdbApiRestClient.setReleaseType(ReleaseType.THEATRICAL_ALL); // "3 | 2"
```
검색 조건 언어 설정은 한국어, 지역은 한국, 릴리즈 타입은 극장으로 설정되어 있으며 변경 가능합니다.

<br>

자세한 사용 예시는 [TmdbApiServiceTest](https://github.com/howtis/tmdb-java-api/blob/master/src/test/java/com/howtis/api/client/TmdbApiServiceTest.java)
에서 보실 수 있습니다.
