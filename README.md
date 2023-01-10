# SpringJpa-JWT
JPA로 만든 JWT토큰발행 및 권한


## 인증관련 Architecture

![image](https://user-images.githubusercontent.com/79193811/211472419-333a5a45-b535-4886-8023-9faa0b3d40d5.png)

![image](https://user-images.githubusercontent.com/79193811/211473295-6a5fddc1-7ab7-42d1-b58c-8690c18091dc.png)

## 토큰발급시 Refresh 토큰 및 Access Token 발급

![image](https://user-images.githubusercontent.com/79193811/211472872-54801e66-bf5d-45b5-9aa1-b4c8ae64c94f.png)

## Hedaer Authorization token 기입 후 유저 정보확인

![image](https://user-images.githubusercontent.com/79193811/211472982-130c0679-f30f-4754-b54f-96d06d40cca8.png)


## 토큰 만료시 header에 Refresh 토큰값 삽입 후 재발급 요청

![image](https://user-images.githubusercontent.com/79193811/211473110-ad50bd41-8efe-4ad1-89df-c90345b89c20.png)
