
# Run aplication

```bash 
 ./gradlew bootRun
```

# Test controller 

```bash
curl --location 'http://localhost:8080/v1/task/' \
--header 'Content-Type: application/json' \
--data '{

"title" :"no"

}'
```

# Project structure

```bash

src/
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── hexagonal
│   │               ├── appication
│   │               │   ├── services
│   │               │   │   └── TaskServices.java
│   │               │   └── usecases
│   │               │       ├── CreateTaskUseCase.java
│   │               │       ├── DeleteTaskUseCase.java
│   │               │       ├── RetriveAdditionalTaskInfoUseCase.java
│   │               │       ├── RetriveTaskUseCase.java
│   │               │       └── UpdateTaskUseCase.java
│   │               ├── domain
│   │               │   ├── models
│   │               │   │   ├── AdditionalTaskInfo.java
│   │               │   │   └── Task.java
│   │               │   └── ports
│   │               │       ├── in
│   │               │       │   ├── CreateTask.java
│   │               │       │   ├── DeleteTask.java
│   │               │       │   ├── RetriveAdditionalTaskInfo.java
│   │               │       │   ├── RetriveTask.java
│   │               │       │   └── UpdateTask.java
│   │               │       └── out
│   │               │           ├── AdditionalTaskInfoRepository.java
│   │               │           └── TaskRepository.java
│   │               ├── HexagonalArchitectureApplication.java
│   │               └── infrastructure
│   │                   ├── adapters
│   │                   ├── config
│   │                   ├── controllers
│   │                   │   └── TaskController.java
│   │                   ├── entities
│   │                   │   └── TaskEntity.java
│   │                   └── repositories
│   │                       ├── TaskJpaRepositoryAdapter.java
│   │                       └── TaskJpaRepository.java
│   └── resources
│       ├── application.properties
│       ├── static
│       └── templates
└── test
    └── java
        └── com
            └── example
                └── hexagonal
                    └── HexagonalArchitectureApplicationTests.java


```

