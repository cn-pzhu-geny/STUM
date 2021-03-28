let talentTemplate =
    `<div class="col-md-6">
            <div class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                <div class="col p-4 d-flex flex-column position-static">
                    <h3 class="mb-0">{{student.stuName}}</h3>
                    <div class="mb-1 text-muted">{{student.stuClass}}</div>
                    <p class="card-text mb-auto">{{student.stuInfo}}</p>
                    <a class="stretched-link" v-bind:href="'search?stuNo='+student.stuNo" onclick="err()">了解更多</a>
                </div>
                <div class="col-auto d-none d-lg-block">
                    <div v-if="student.stuPhoto!=-1">
                        <img v-bind:src="'files/header/'+student.stuPhoto+'.png'" class="bd-placeholder-img" width="200" height="250" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"/>
                    </div>
                    <div v-else>
                        <svg class="bd-placeholder-img" width="200" height="250" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">此人很神秘暂无头像</text></svg>
                    </div>
                </div>
            </div>
    </div>`

$(document).ready(
    function loadTalent() {
        $.ajax(
            {
                url: "/getTalentList",
                success: function (students) {
                    let jsonStudents = JSON.parse(students);
                    console.log(jsonStudents);
                    Vue.component('talent_container', {
                        props: ['student'],
                        template: talentTemplate
                    })
                    new Vue({
                        el: '.talentContainer',
                        data: {
                            jsonStudents
                        }
                    })
                }
            }
        )
    }
)

function err(){
    if ($.cookie("status")&&$.cookie("status")!=="-1"){

    }else {
        alert("请登陆账号")
    }
}

