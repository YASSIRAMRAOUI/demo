<link rel="stylesheet" href="${pageContext.request.contextPath}/Styles/articles.css" />

<body>
    <div class="form-container">
        <h2>${article != null ? "Edit Article" : "New Article"}</h2>
        <form action="${article != null ? 'update' : 'insert'}" method="post">
            <input type="hidden" name="id" value="${article != null ? article.id : ''}">
            <p>
                <label>Title:</label>
                <input type="text" name="title" value="${article != null ? article.title : ''}" required>
            </p>
            <p>
                <label>Content:</label>
                <textarea name="content" rows="10" required>${article != null ? article.content : ''}</textarea>
            </p>
            <p>
                <label>Author:</label>
                <input type="text" name="author" value="${article != null ? article.author : ''}">
            </p>
            <p>
                <input type="submit" value="${article != null ? 'Update' : 'Submit'}">
                <a href="list" class="cancel-button">Cancel</a>
            </p>
        </form>
    </div>
</body>
