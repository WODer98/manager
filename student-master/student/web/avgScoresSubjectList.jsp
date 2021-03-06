<%--
  Created by IntelliJ IDEA.
  User: 12037
  Date: 2020/6/22
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>各科目平均成绩</title>
    <style>
        table {
            width: 600px;
            height: 150px;
            border: solid #019BE5;
            font-weight: normal;
            text-align: center;
            margin-left: 355px;
        }

        th {
            font-Size: 20px;
            font-Weight: bold;
            width: auto;
            height: auto
        }

        td {
            font-Size: 16px;
            font-Weight: normal;
        }

        h2 {
            margin-left: 575px;
        }

        form {
            margin-left: 500px;
        }

      #back_teacher{
          margin-left: 575px;
      }
    </style>
</head>
<body>
<h2>各科目平均成绩</h2>
<button id="back_teacher">返回到教师界面</button><br><br>
<table border="solid">
    <thead>
    <tr>
        <th>课程号</th>
        <th>课程名称</th>
        <th>平均成绩</th>
    </tr>
    </thead>
    <tbody id="tb">
    </tbody>
</table>
<script src="js/jquery/jquery-3.4.1.js"></script>
<script type="text/javascript">
    $(function () {
        $.ajax({
            url : "/wod/u/teacher/scores/avg",
            method : "GET",
            success : function (response) {
                let $avgScoreSubList = response.objectMap.avgSubjects;
                console.log($avgScoreSubList);
                let $str = '';
                for (let i=0;i<$avgScoreSubList.length;i++){
                    $str += '<tr><td>' + $avgScoreSubList[i].courseId +
                            '</td><td>' + $avgScoreSubList[i].courseName +
                            '</td><td>' + $avgScoreSubList[i].avgScore + '</td></tr>';
                }
                tb.innerHTML = $str;
            },
            error : function () {
                console.log("请求迷路了...");
            }
        });
    });
    $("#back_teacher").click(function () {
        window.location = "/wod/teacher.jsp"
    });
</script>
</body>
</html>
