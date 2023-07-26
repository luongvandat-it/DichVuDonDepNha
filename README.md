# DichVuDonDepNha

Implement basic microservices architecture

## Members

- Luong Van Dat (C)
- Nguyen Minh Quan

## List API
### 1. API Auth
#### 1.1 Register

```
curl --location 'http://localhost:8080/api/account/register' \
--header 'Content-Type: application/json' \
--data '{
    "password": "minhquan",
    "firstName": "Nguyễn Minh",
    "lastName": "Quan",
    "gender": true,
    "phone": "035492745",
    "roles": [
        {
            "id": 2
        }
    ]
}'
```
Result
```
User registered successfully
```
#### 1.2 Login
```
curl --location 'http://localhost:8080/auth/login' \
--header 'Content-Type: application/json' \
--data '{
    "phone": "0354927403",
    "password": "minhquan"
}'
```
Result
```
{
    "id": "17",
    "firstName": "Nguyễn Minh",
    "lastName": "Quan",
    "phone": "0354927403",
    "gender": true,
    "accessToken": "eyJhbGciOiJIUzUxMiJ9.eyJyb2xlcyI6IltST0xFX0dVRVNUXSIsImlkIjoiMTciLCJzdWIiOiIwMzU0OTI3NDAzIiwiaWF0IjoxNjkwMzQ0NzczLCJleHAiOjE2OTA3NzY3NzN9.HImeXe7xgdhpAQgV40gQYgKRhqSB4uqrigLp9JT_bx4jLVFQ8kpH8kX-bR8Bh4X4nwJoZsQMuNtJ6PhqAjxWyA",
    "refreshToken": "eyJhbGciOiJIUzUxMiJ9.eyJyb2xlcyI6IltST0xFX0dVRVNUXSIsImlkIjoiMTciLCJzdWIiOiIwMzU0OTI3NDAzIiwiaWF0IjoxNjkwMzQ0NzczLCJleHAiOjE2OTA3NzY3NzN9.HImeXe7xgdhpAQgV40gQYgKRhqSB4uqrigLp9JT_bx4jLVFQ8kpH8kX-bR8Bh4X4nwJoZsQMuNtJ6PhqAjxWyA"
}
```
### 2. API Employee
#### 2.1 Create a new employee
```
curl --location 'http://localhost:8080/api/employee/create' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJyb2xlcyI6IltST0xFX0dVRVNUXSIsImlkIjoiMTciLCJzdWIiOiIwMzU0OTI3NDAzIiwiaWF0IjoxNjkwMzQ0NzczLCJleHAiOjE2OTA3NzY3NzN9.HImeXe7xgdhpAQgV40gQYgKRhqSB4uqrigLp9JT_bx4jLVFQ8kpH8kX-bR8Bh4X4nwJoZsQMuNtJ6PhqAjxWyA' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "Nhân",
    "lastName": "Viên 5",
    "gender": true,
    "phone": "0942487550",
    "email": "nhanvien4@gmail.com",
    "rating": 5
}'
```
#### 2.2 Get employee
```
curl --location 'http://localhost:8080/api/employee/get?id=2' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJyb2xlcyI6IltST0xFX0dVRVNUXSIsImlkIjoiMTciLCJzdWIiOiIwMzU0OTI3NDAzIiwiaWF0IjoxNjkwMjk5MzI3LCJleHAiOjE2OTA3MzEzMjd9.1fFpHQlAdhLGaPddefLTDlAL-Xnms1FB64r9pVTYNs_mWME7Y1QkWtURX06ZT_pWSJggcUhWYQhZWZvCXoLfZQ'
```
#### 2.3 Get a list of employees
```
curl --location 'http://localhost:8080/api/employee/getAll'
```
