$(document).ready(
    function loadTalent(){
        $.ajax(
            {
                url:"/getTalentList",
                success:function (students){
                    let jsonStudents = JSON.parse(students);
                    let containers = $(".talent_container");
                    for (let i = 0; i < $(containers).length; i++) {
                        $(".name").eq(i).text(jsonStudents[i].stuName)
                        $(".class_").eq(i).text(jsonStudents[i].stuClass)
                        $(".desc").eq(i).text(jsonStudents[i].stuInfo)
                        console.log($(containers).eq(i));
                    }
                }
            }
        )
    }
)