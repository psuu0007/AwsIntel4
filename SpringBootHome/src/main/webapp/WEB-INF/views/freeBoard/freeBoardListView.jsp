<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판 목록</title>

<script src="https://code.jquery.com/jquery-3.7.1.js" 
	integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" 
	crossorigin="anonymous"></script>

<style type="text/css">
table, th, tr, td{
	border: 1px solid black;
	border-collapse: collapse;	
}

tr > th{
	background: gray;
}

.aTagStyle{
	cursor: pointer;
}

.aTagStyle:hover {
	color: lightgreen;
	background: gray;
}

/* 게시판 추가 css*/
#container{
	border: 1px solid black;
}

#container > tr{
	width: 980px;
}

.tableSubject{
	width: 245px;
	background-color: gray;
}

.tableValue{
	width: 245px;
}
</style>

<script type="text/javascript">
// 	db에 있는 파일들 화면 만들기
	function storeFileListMakeUlFnc(freeBoardFileList) {
		const storeFileListUl = $('#storeFileList');
		
		storeFileListUl.html('');
		let listItem = null;
		
		if(freeBoardFileList.length == 0){
			listItem = $('<li>저장된 파일이 없습니다.</li>');
			
			storeFileListUl.html(listItem);
			return;
		}
		
		var liHtmlStr = '';
		for (var i = 0; i < freeBoardFileList.length; i++) {
			listItem = document.createElement('li');
			
			liHtmlStr = freeBoardFileList[i].originalFileName
				+ '&nbsp;&nbsp;'
				+ freeBoardFileList[i].freeBoardFileSize + '(kb)'
				+ '<img alt="image not found" src="/img/' 
				+ freeBoardFileList[i].storedFileName
				+ '" style="width: 150px;" />'
				+ '<span>'
				+ '<input type="button" value="수정">'
				+ '<input type="button" value="삭제">'
				+ '</span>';   
				
				listItem.innerHTML = liHtmlStr;
				storeFileListUl.append(listItem);
		}
	} // storeFileListMakeUlFnc end

	$(document).ready(function() {
		
		// 글쓰기 db저장하는 로직&화면
		$('#container').on('click', '#btnFreeBoardInsert', function(event) {
			event.preventDefault();
			
// 			var myObj = $(this);
			
			var inputMemberNoTag = $('#inputMemberNo');
// 			alert(inputMemberNoTag.val());
			var freeBoardTitleTag = $('#freeBoardTitle');
			var freeBoardContentTag = $('#freeBoardContent');
			
			// form태그 그 자체
			var formDataObj = new FormData();
			
// 			input태그 설정			
// 								name			value
			formDataObj.append('freeBoardId', 0);
			formDataObj.append('memberNo', inputMemberNoTag.val());
			formDataObj.append('freeBoardTitle', freeBoardTitleTag.val());
			formDataObj.append('freeBoardContent', freeBoardContentTag.val());
			
// 			var jsonDataObj = {
// 				freeBoardId: 0,
// 				memberNo: inputMemberNoTag.val(),
// 				freeBoardTitle: freeBoardTitleTag.val(),
// 				freeBoardContent: freeBoardContentTag.val(),
// 				createDate: null,
// 				updateDate: null
// 			};
			
			const inputFreeBoardFileArr = $('#inputFreeBoardFile')[0].files;
			
			if(inputFreeBoardFileArr.length > 0){
				for (var i = 0; i < inputFreeBoardFileArr.length; i++) {
					formDataObj.append('inputFreeBoardFileArr' + i,
						inputFreeBoardFileArr[i]);
				}
			}
			
			$.ajax({
				url: '/freeBoard/',
				method: 'POST',
// 				contentType: 'application/json',
				processData: false,
				contentType: false,
				data: formDataObj,
// 				dataType: 'json',
				success: function(data) {
					location.href = './list';
				},
				error: function(xhr, status) {
					alert(xhr.status + " / " + status);
					
				}
			}); // ajax 종료
			
		}); // btnFreeBoardInsert end
		
		// 글쓰기 조작이 가능한 화면 get 영역
		$('#aFreeBoardInsert').on('click', function(event) {
			var myObj = $(this);
			
			event.preventDefault();
			
			let containerTag = $('#container');
			let htmlStr = '';
			
htmlStr += '<table style="width: 1000px;">';
htmlStr += '<tr>';
htmlStr += '<td class="tableSubject">주제</td>';
htmlStr += '<td style="width: 735px;">';
htmlStr += '<input type="text" id="freeBoardTitle" name="freeBoardTitle" value="" size="100px">';

htmlStr += '</td>';
htmlStr += '</tr>';
			
			htmlStr += '<tr>';
			htmlStr += '<td style="width: 980px;" colspan="2">';
			htmlStr += '<textarea id="freeBoardContent" name="freeBoardContent" ';
			htmlStr += 'rows="10" cols="100" style="width: 990px;">';
			htmlStr += '</textarea>';
			htmlStr += '</td>';
			htmlStr += '</tr>	';
			htmlStr += '</table>';
	// 파일 처리 화면		
htmlStr += '<div id="fileContainer" style="border: 1px solid black;">';
htmlStr += '<label for="inputFreeBoardFile">파일</label>';
htmlStr += '<input type="file" id="inputFreeBoardFile" name="freeBoardFileList" multiple>';
htmlStr += '<ul id="fileList" class="fileUploadList"></ul>';
htmlStr += '</div>';
			
			htmlStr += '<div>';
			htmlStr += '<span>';
			htmlStr += '<button onclick="pageMoveFreeBoardListFnc();">목록 페이지</button>';
			htmlStr += '<button id="btnFreeBoardInsert">작성완료</button>';
			htmlStr += '</span>';
			htmlStr += '</div>';
			
			containerTag.html(htmlStr);
			
			const inputFreeBoardFile = 
				document.getElementById('inputFreeBoardFile');
			const fileListUl = document.getElementById('fileList');
			
			inputFreeBoardFile.addEventListener('change', function() {
				fileListUl.innerHTML = '';
				for (var i = 0; i < inputFreeBoardFile.files.length; i++) {
					let listItem = document.createElement('li');
					listItem.innerHTML = inputFreeBoardFile.files[i].name
						+ '&nbsp;&nbsp;' + inputFreeBoardFile.files[i].size
						+ '(byte)';
					fileListUl.appendChild(listItem);
				}
			}); // inputFreeBoardFile 리스너 끝
		}); // aFreeBoardInsert end
		
		
	}); // ready 함수 end
	
	//자유게시판 수정 화면 만드는 곳
	function restRequestFreeBoardUpdateFnc(tableTdTag){
		let tableTdTagObj = $(tableTdTag);
		
// 		alert(tableTdTagObj.attr('class'));
		
		let parentTr = tableTdTagObj.parent();
		let freeBoardIdStr = parentTr.children().eq(0).text();
// 		alert(freeBoardIdStr);
		
		$.ajax({
			url: '/freeBoard/' + freeBoardIdStr,
			method: 'GET',
			dataType: 'json',
			success: function (data) {
// 				alert('데이터 가져와 졌나? ' + data.email);
				
				var freeBoardVo = data.freeBoardVo;
				var freeBoardFileList = data.freeBoardFileList;

				let createDate = new Date(freeBoardVo.createDate).toLocaleString('ko-KR', {
					year: 'numeric',
					month: '2-digit',
					day: '2-digit',
					hour: '2-digit',
					minute: '2-digit',
					second: '2-digit'
				});
				
				let containerTag = $('#container');
				let htmlStr = '';
				
htmlStr += '<table style="width: 1000px;">';
htmlStr += '<tr>';
htmlStr += '<td class="tableSubject">주제</td>';
htmlStr += '<td style="width: 735px;" colspan="3">';
htmlStr += '<input type="text" id="freeBoardTitle" name="freeBoardTitle"';
htmlStr += ' value="' + freeBoardVo.freeBoardTitle + '" size="100px">';
htmlStr += '</td>';
htmlStr += '</tr>';

htmlStr += '<tr>';
htmlStr += '<td class="tableSubject">작성자</td>';
htmlStr += '<td class="tableValue">' + freeBoardVo.memberName + '</td>';
htmlStr += '<td class="tableSubject">게시판 번호</td>';
htmlStr += '<td class="tableValue">';
htmlStr += '<input type="text" id="freeBoardId" name="freeBoardId"';
htmlStr += ' value="' + freeBoardVo.freeBoardId + '" readonly>';
htmlStr += '</td>';
htmlStr += '</tr>';

htmlStr += '<tr>';
htmlStr += '<td class="tableSubject">이메일</td>';
htmlStr += '<td class="tableValue">' + freeBoardVo.email + '</td>';
htmlStr += '<td class="tableSubject">작성일자</td>';
htmlStr += '<td class="tableValue">' + createDate + '</td>';
htmlStr += '</tr>';

htmlStr += '<tr>';
htmlStr += '<td style="width: 980px;" colspan="4">';
htmlStr += '<textarea id="freeBoardContent" name="freeBoardContent"';
htmlStr += ' rows="10" cols="100" style="width: 990px;">';
htmlStr += '</textarea>';
htmlStr += '</td>';
htmlStr += '</tr>';
htmlStr += '</table>';


// 이미지 출력 영역
htmlStr += '<div id="fileContainer" style="border: 1px solid black;">';
htmlStr += '<label for="inputFreeBoardFile">파일</label>';
htmlStr += '<input type="file" id="inputFreeBoardFile" name="freeBoardFileList" multiple>';
htmlStr += '<ul id="fileList" class="fileUploadList"></ul>';
htmlStr += '<ul id="storeFileList" class="fileUploadList"></ul>';
htmlStr += '</div>';

				var InputSessionMemberNoTag = $('#inputMemberNo');
// 내가 만든거냐, 남이 만든거냐				
if(freeBoardVo.memberNo == InputSessionMemberNoTag.val()){
	htmlStr += '<div>';
	htmlStr += '<span>';
	htmlStr += '<button onclick="pageMoveFreeBoardListFnc();">목록 페이지</button>';
	htmlStr += '<button onclick="restRequestFreeBoardUpdateCtrFnc();">수정완료</button>';
	htmlStr += '</span>';
	htmlStr += '</div>';
}else{
	htmlStr += '<div>';
	htmlStr += '<span>';
	htmlStr += '<button onclick="pageMoveFreeBoardListFnc();">목록 페이지</button>';
	htmlStr += '</span>';
	htmlStr += '</div>';
}
				
				containerTag.html(htmlStr);
				
				let freeBoardContentTag = $('#freeBoardContent');
				
				freeBoardContentTag.text(freeBoardVo.freeBoardContent);
				
				storeFileListMakeUlFnc(freeBoardFileList);
				
				const inputFreeBoardFile = 
					document.getElementById('inputFreeBoardFile');
				const fileListUl = document.getElementById('fileList');
				
				inputFreeBoardFile.addEventListener('change', function() {
					fileListUl.innerHTML = '';
					for (var i = 0; i < inputFreeBoardFile.files.length; i++) {
						let listItem = document.createElement('li');
						listItem.innerHTML = inputFreeBoardFile.files[i].name
						+ '&nbsp;&nbsp;' + inputFreeBoardFile.files[i].size 
						+ '(byte)';
						
						fileListUl.appendChild(listItem);
					}
				});
			}, // success end
			error: function(xhr, status) {
				alert(xhr.status + " / " + status);
			}
		}); // ajax end
	}	// restRequestFreeBoardUpdateFnc end
	
	// 게시판 수정(db) 기능 구현
	function restRequestFreeBoardUpdateCtrFnc() {
		var inputMemberNoTag = $('#inputMemberNo');
		var freeBoardIdTag = $('#freeBoardId');
		var freeBoardTitleTag = $('#freeBoardTitle');
		var freeBoardContentTag = $('#freeBoardContent');
		
		
		var formDataObj = new FormData();
		
		formDataObj.append('freeBoardId', 0);
		formDataObj.append('memberNo', inputMemberNoTag.val());
		formDataObj.append('freeBoardTitle', freeBoardTitleTag.val());
		formDataObj.append('freeBoardContent', freeBoardContentTag.val());
		
		var storeFileListUl = $('#storeFileList');
		console.log(storeFileListUl);
		
// 		수정완료 페이지에서 삭제할 파일 처리
		storeFileListUl.find('span[delfileid]').each(function(index, item) {
			formDataObj.append('delFreeBoardFileIdList'
				, $(item).attr('delfileid'));
		});
		
		const inputFreeBoardFileArr = $('#inputFreeBoardFile')[0].files;
		
		if(inputFreeBoardFileArr.length > 0){
			for (let i = 0; i < inputFreeBoardFileArr.length; i++) {
				formDataObj.append('inputFreeBoardFileArr' + i
					, inputFreeBoardFileArr[i]);
			}
		}
		
		$.ajax({
			url: '/freeBoard/' + freeBoardIdTag.val(),
			method: 'PATCH',
			processData: false,
			contentType: false,
			data: formDataObj,
			success: function (resultMap) {

				var freeBoardVo = resultMap.freeBoardVo;
				var freeBoardFileList = resultMap.freeBoardFileList;
				
				let createDate = new Date(freeBoardVo.createDate).toLocaleString('ko-KR', {
					year: 'numeric',
					month: '2-digit',
					day: '2-digit',
					hour: '2-digit',
					minute: '2-digit',
					second: '2-digit'
				});
				
				let containerTag = $('#container');
				
				// 백틱`
				let htmlStr = `
	<table style="width: 1000px;">
		<tr>
			<td class="tableSubject">주제</td>
			<td style="width: 735px;" colspan="3">
				<input type="text" id="freeBoardTitle" name="freeBoardTitle" 
					value="\${freeBoardVo.freeBoardTitle}">
			</td>
		</tr>
		<tr>
			<td class="tableSubject">작성자</td>
			<td class="tableValue">\${freeBoardVo.memberName}</td>
			<td class="tableSubject">게시판 번호</td>
			<td class="tableValue">
				<input type="text" id="freeBoardId" name="freeBoardId"
					value="\${freeBoardVo.freeBoardId}" readonly>
			</td>
		</tr>
		<tr>
			<td class="tableSubject">이메일</td>
			<td class="tableValue">\${freeBoardVo.email}</td>
			<td class="tableSubject">작성일자</td>
			<td class="tableValue">\${createDate}</td>
		</tr>
		<tr>
			<td style="width: 980px;" colspan="4">
				<textarea id="freeBoardContent" name="freeBoardContent" 
					rows="10" cols="100" style="width: 990px;">
				</textarea>
			</td>
		</tr>	
	</table>
	
// 	수정페이지에서 파일 관리 화면
	<div id="fileContainer" style="border: 1px solid black;">
		<label for="inputFreeBoardFile">파일</label>
		<input type="file" id="inputFreeBoardFile" name="freeBoardFileList" 
			multiple>
		<ul id="fileList" class="fileUploadList"></ul>
		<ul id="storeFileList" class="fileUploadList"></ul>
	</div>
	
	<div>
		<span>
			<button onclick="pageMoveFreeBoardListFnc();">목록 페이지</button>
			<button onclick="restRequestFreeBoardUpdateCtrFnc();">수정 완료</button>
			<input type="button" value="삭제하기" onclick="alert('미완성');">
		</span>
	</div>
				`;
				
				containerTag.html(htmlStr);
				
				let freeBoardContentTag = $('#freeBoardContent');
				freeBoardContentTag.text(freeBoardVo.freeBoardContent);
				
				storeFileListMakeUlFnc(freeBoardFileList);
			},	// 성공 end
			error: function (xhr, status) {
				alert(xhr.status + ' / ' + status);
				
				var errorMessage = xhr.responseJSON ? xhr.responseJSON.errorMsg :
					'알 수 없는 오류가 발생했습니다.';
				alert('오류: ' + errorMessage);
			}
			
		}); //ajax end
		
		
	}  // restRequestFreeBoardUpdateCtrFnc end
	
</script>

</head>
<body>


	<jsp:include page="/WEB-INF/views/Header.jsp"/>
	
	<div id="container">
	
		<h1>자유게시판 목록</h1>
		<p>
			<a id="aFreeBoardInsert" href="#">자유게시판 글쓰기</a>
		</p>
		
		<table>
			<tr>
				<th>번호</th><th>주제</th><th>작성자</th>
				<th>생성날짜</th><th>수정날짜</th><th>비고[삭제]</th>
			</tr>
		
		<c:forEach var="freeBoardVo" items="${freeBoardList}">
			<tr>
				<td>${freeBoardVo.freeBoardId}</td>
				<td class='aTagStyle' onclick="restRequestFreeBoardUpdateFnc(this);">
					${freeBoardVo.freeBoardTitle}
				</td>
				<td>${freeBoardVo.memberName}</td>
				<td>${freeBoardVo.createDate}</td>
				<td>${freeBoardVo.updateDate}</td>
				<td style="text-align: center;">
					[삭제]
				</td>
			</tr>
		</c:forEach>
		
		</table>
		
		<jsp:include page="/WEB-INF/views/common/Paging.jsp">
			<jsp:param value="${pagingMap}" name="pagingMap"/>
		</jsp:include>
		
		<form action="./list" id="pagingForm" method="post">
			<input type="hidden" id="curPage" name="curPage"
			   value="${pagingMap.pagingVo.curPage}">
		</form>
	</div>
	
	<jsp:include page="/WEB-INF/views/Tail.jsp"/>
</body>
</html>