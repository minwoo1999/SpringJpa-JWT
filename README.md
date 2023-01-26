# SpringJpa-JWT
JPA로 만든 JWT토큰발행 및 권한


## 인증관련 Architecture

![image](https://user-images.githubusercontent.com/79193811/211472419-333a5a45-b535-4886-8023-9faa0b3d40d5.png)

![image](https://user-images.githubusercontent.com/79193811/211473295-6a5fddc1-7ab7-42d1-b58c-8690c18091dc.png)

1. 사용자가 로그인 정보와 함께 인증 요청 (HttpRequest)
2. AuthenticationFilter가 요청을 가로챔. 이때 가로챈 정보를 통해 UsernamePasswordAuthenticationToken 객체 (사용자가 입력한 데이터를 기반으로 생성, 즉 현 상태는 미검증 Authentication) 생성
3. ProviderManager (AuthenticationManager 구현체) 에게 UsernamePasswordAuthenticationToken 객체를 전달
4. AuthenticationProvider에 UsernamePasswordAuthenticationToken 객체를 전달
5. 실제 DB로 부터 사용자 인증 정보를 가져오는 UserDetailsService에 사용자 정보를 넘겨줌
6. 넘겨받은 정보를 통해 DB에서 찾은 사용자 정보인 UserDetails 객체를 생성
7. AuthenticationProvider는 UserDetails를 넘겨받고 사용자 정보를 비교
8 .인증이 완료되면, 사용자 정보를 담은 Authentication 객체를 반환
9 .최초의 AuthenticationFilter에 Authentication 객체가 반환됨
10 .Authentication 객체를 SecurityContext에 저장

## 토큰발급시 Refresh 토큰 및 Access Token 발급

![image](https://user-images.githubusercontent.com/79193811/211472872-54801e66-bf5d-45b5-9aa1-b4c8ae64c94f.png)

## Hedaer Authorization token 기입 후 유저 정보확인

![image](https://user-images.githubusercontent.com/79193811/211472982-130c0679-f30f-4754-b54f-96d06d40cca8.png)


## 토큰 만료시 header에 Refresh 토큰값 삽입 후 재발급 요청

![image](https://user-images.githubusercontent.com/79193811/211473110-ad50bd41-8efe-4ad1-89df-c90345b89c20.png)
