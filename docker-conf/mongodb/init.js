db.createUser(
    {
        user: "projectb",
        pwd: "1q2w3e4r!!Q",
        "roles" : [
            {
                "role" : "userAdminAnyDatabase",
                "db" : "admin"
            },
            {
                "role" : "dbAdminAnyDatabase",
                "db" : "admin"
            },
            {
                "role" : "readWriteAnyDatabase",
                "db" : "admin"
            }
        ],
    }
);
