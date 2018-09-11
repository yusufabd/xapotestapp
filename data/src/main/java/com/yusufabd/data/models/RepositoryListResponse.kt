package com.yusufabd.data.models

data class RepositoryListResponse(
    val total_count: Int, // 750306
    val incomplete_results: Boolean, // false
    val items: List<Item>
) {
    data class Item(
        val id: Int, // 8859474
        val node_id: String, // MDEwOlJlcG9zaXRvcnk4ODU5NDc0
        val name: String, // jadx
        val full_name: String, // skylot/jadx
        val owner: Owner,
        val private: Boolean, // false
        val html_url: String, // https://github.com/skylot/jadx
        val description: String, // Dex to Java decompiler
        val fork: Boolean, // false
        val url: String, // https://api.github.com/repos/skylot/jadx
        val forks_url: String, // https://api.github.com/repos/skylot/jadx/forks
        val keys_url: String, // https://api.github.com/repos/skylot/jadx/keys{/key_id}
        val collaborators_url: String, // https://api.github.com/repos/skylot/jadx/collaborators{/collaborator}
        val teams_url: String, // https://api.github.com/repos/skylot/jadx/teams
        val hooks_url: String, // https://api.github.com/repos/skylot/jadx/hooks
        val issue_events_url: String, // https://api.github.com/repos/skylot/jadx/issues/events{/number}
        val events_url: String, // https://api.github.com/repos/skylot/jadx/events
        val assignees_url: String, // https://api.github.com/repos/skylot/jadx/assignees{/user}
        val branches_url: String, // https://api.github.com/repos/skylot/jadx/branches{/branch}
        val tags_url: String, // https://api.github.com/repos/skylot/jadx/tags
        val blobs_url: String, // https://api.github.com/repos/skylot/jadx/git/blobs{/sha}
        val git_tags_url: String, // https://api.github.com/repos/skylot/jadx/git/tags{/sha}
        val git_refs_url: String, // https://api.github.com/repos/skylot/jadx/git/refs{/sha}
        val trees_url: String, // https://api.github.com/repos/skylot/jadx/git/trees{/sha}
        val statuses_url: String, // https://api.github.com/repos/skylot/jadx/statuses/{sha}
        val languages_url: String, // https://api.github.com/repos/skylot/jadx/languages
        val stargazers_url: String, // https://api.github.com/repos/skylot/jadx/stargazers
        val contributors_url: String, // https://api.github.com/repos/skylot/jadx/contributors
        val subscribers_url: String, // https://api.github.com/repos/skylot/jadx/subscribers
        val subscription_url: String, // https://api.github.com/repos/skylot/jadx/subscription
        val commits_url: String, // https://api.github.com/repos/skylot/jadx/commits{/sha}
        val git_commits_url: String, // https://api.github.com/repos/skylot/jadx/git/commits{/sha}
        val comments_url: String, // https://api.github.com/repos/skylot/jadx/comments{/number}
        val issue_comment_url: String, // https://api.github.com/repos/skylot/jadx/issues/comments{/number}
        val contents_url: String, // https://api.github.com/repos/skylot/jadx/contents/{+path}
        val compare_url: String, // https://api.github.com/repos/skylot/jadx/compare/{base}...{head}
        val merges_url: String, // https://api.github.com/repos/skylot/jadx/merges
        val archive_url: String, // https://api.github.com/repos/skylot/jadx/{archive_format}{/ref}
        val downloads_url: String, // https://api.github.com/repos/skylot/jadx/downloads
        val issues_url: String, // https://api.github.com/repos/skylot/jadx/issues{/number}
        val pulls_url: String, // https://api.github.com/repos/skylot/jadx/pulls{/number}
        val milestones_url: String, // https://api.github.com/repos/skylot/jadx/milestones{/number}
        val notifications_url: String, // https://api.github.com/repos/skylot/jadx/notifications{?since,all,participating}
        val labels_url: String, // https://api.github.com/repos/skylot/jadx/labels{/name}
        val releases_url: String, // https://api.github.com/repos/skylot/jadx/releases{/id}
        val deployments_url: String, // https://api.github.com/repos/skylot/jadx/deployments
        val created_at: String, // 2013-03-18T17:08:21Z
        val updated_at: String, // 2018-09-11T08:39:31Z
        val pushed_at: String, // 2018-09-08T15:39:03Z
        val git_url: String, // git://github.com/skylot/jadx.git
        val ssh_url: String, // git@github.com:skylot/jadx.git
        val clone_url: String, // https://github.com/skylot/jadx.git
        val svn_url: String, // https://github.com/skylot/jadx
        val homepage: String?,
        val size: Int, // 10919
        val stargazers_count: Int, // 15857
        val watchers_count: Int, // 15857
        val language: String?, // Java
        val has_issues: Boolean, // true
        val has_projects: Boolean, // true
        val has_downloads: Boolean, // true
        val has_wiki: Boolean, // false
        val has_pages: Boolean, // false
        val forks_count: Int, // 1607
        val mirror_url: Any, // null
        val archived: Boolean, // false
        val open_issues_count: Int, // 126
        val license: License,
        val forks: Int, // 1607
        val open_issues: Int, // 126
        val watchers: Int, // 15857
        val default_branch: String, // master
        val score: Double // 44.884922
    ) {
        data class License(
            val key: String, // apache-2.0
            val name: String, // Apache License 2.0
            val spdx_id: String, // Apache-2.0
            val url: String, // https://api.github.com/licenses/apache-2.0
            val node_id: String // MDc6TGljZW5zZTI=
        )

        data class Owner(
            val login: String, // skylot
            val id: Int, // 118523
            val node_id: String, // MDQ6VXNlcjExODUyMw==
            val avatar_url: String, // https://avatars3.githubusercontent.com/u/118523?v=4
            val gravatar_id: String,
            val url: String, // https://api.github.com/users/skylot
            val html_url: String, // https://github.com/skylot
            val followers_url: String, // https://api.github.com/users/skylot/followers
            val following_url: String, // https://api.github.com/users/skylot/following{/other_user}
            val gists_url: String, // https://api.github.com/users/skylot/gists{/gist_id}
            val starred_url: String, // https://api.github.com/users/skylot/starred{/owner}{/repo}
            val subscriptions_url: String, // https://api.github.com/users/skylot/subscriptions
            val organizations_url: String, // https://api.github.com/users/skylot/orgs
            val repos_url: String, // https://api.github.com/users/skylot/repos
            val events_url: String, // https://api.github.com/users/skylot/events{/privacy}
            val received_events_url: String, // https://api.github.com/users/skylot/received_events
            val type: String, // User
            val site_admin: Boolean // false
        )
    }
}