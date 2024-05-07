package com.example.restfulapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ErrViewModel(application: Application): AndroidViewModel(application) {

    val httperrors: LiveData<List<HttpErrCode>>

    private val repository : AppRepository

    init{
        val httperrDao = AppDatabase.getDataBase(application).actionDao()
        repository = AppRepository(httperrDao)
        httperrors = repository.getAll()
    }
    fun insert(err : HttpErrCode) = viewModelScope.launch {
        repository.insert(err)
    }

    fun update(err: HttpErrCode) = viewModelScope.launch {
        repository.update(err)
    }
    fun delete(err : HttpErrCode) = viewModelScope.launch {
        repository.delete(err)
    }

    fun initer(){
        this.insert(HttpErrCode(id = null, urlpath = "0", errName = "What the...?"));
        this.insert(HttpErrCode(id = null, urlpath = "100", errName = "Continue"));
        this.insert(HttpErrCode(id = null, urlpath = "101", errName = "Switching Protocols"));
        this.insert(HttpErrCode(id = null, urlpath = "102", errName = "Processing"));
        this.insert(HttpErrCode(id = null, urlpath = "103", errName = "Early Hints"));
        this.insert(HttpErrCode(id = null, urlpath = "200", errName = "OK"));
        this.insert(HttpErrCode(id = null, urlpath = "201", errName = "Created"));
        this.insert(HttpErrCode(id = null, urlpath = "202", errName = "Accepted"));
        this.insert(HttpErrCode(id = null, urlpath = "203", errName = "Non-Authoritative Information"));
        this.insert(HttpErrCode(id = null, urlpath = "204", errName = "No Content"));
        this.insert(HttpErrCode(id = null, urlpath = "205", errName = "Reset Content"));
        this.insert(HttpErrCode(id = null, urlpath = "206", errName = "Partial Content"));
        this.insert(HttpErrCode(id = null, urlpath = "207", errName = "Multy-Status"));
        this.insert(HttpErrCode(id = null, urlpath = "208", errName = "Already Reported"));
        this.insert(HttpErrCode(id = null, urlpath = "214", errName = "Transformation Applied"));
        this.insert(HttpErrCode(id = null, urlpath = "226", errName = "IM Used"));
        this.insert(HttpErrCode(id = null, urlpath = "300", errName = "Multiple Choice"));
        this.insert(HttpErrCode(id = null, urlpath = "301", errName = "Moved Permanently"));
        this.insert(HttpErrCode(id = null, urlpath = "302", errName = "Found"));
        this.insert(HttpErrCode(id = null, urlpath = "303", errName = "See Other"));
        this.insert(HttpErrCode(id = null, urlpath = "304", errName = "Not Modified"));
        this.insert(HttpErrCode(id = null, urlpath = "305", errName = "Use Proxy"));
        this.insert(HttpErrCode(id = null, urlpath = "307", errName = "Temporary Redirect"));
        this.insert(HttpErrCode(id = null, urlpath = "308", errName = "Permanent Redirect"));
        this.insert(HttpErrCode(id = null, urlpath = "400", errName = "Bad Request"));
        this.insert(HttpErrCode(id = null, urlpath = "401", errName = "Unauthorized"));
        this.insert(HttpErrCode(id = null, urlpath = "402", errName = "Payment Required"));
        this.insert(HttpErrCode(id = null, urlpath = "403", errName = "Forbidden"));
        this.insert(HttpErrCode(id = null, urlpath = "404", errName = "Not Found"));
        this.insert(HttpErrCode(id = null, urlpath = "405", errName = "Method Not Allowed"));
        this.insert(HttpErrCode(id = null, urlpath = "406", errName = "Not Acceptable"));
        this.insert(HttpErrCode(id = null, urlpath = "407", errName = "Proxy Authentication Required"));
        this.insert(HttpErrCode(id = null, urlpath = "408", errName = "Request Timeout"));
        this.insert(HttpErrCode(id = null, urlpath = "409", errName = "Conflict"));
        this.insert(HttpErrCode(id = null, urlpath = "410", errName = "Gone"));
        this.insert(HttpErrCode(id = null, urlpath = "411", errName = "Length Required"));
        this.insert(HttpErrCode(id = null, urlpath = "412", errName = "Precondition Failed"));
        this.insert(HttpErrCode(id = null, urlpath = "413", errName = "Payload Too Large"));
        this.insert(HttpErrCode(id = null, urlpath = "414", errName = "Request-URL Too Long"));
        this.insert(HttpErrCode(id = null, urlpath = "415", errName = "Unsupported Media Type"));
        this.insert(HttpErrCode(id = null, urlpath = "416", errName = "Request Range Not Satisfiable"));
        this.insert(HttpErrCode(id = null, urlpath = "417", errName = "Expectations Failed"));
        this.insert(HttpErrCode(id = null, urlpath = "418", errName = "Im a Teapot"));
        this.insert(HttpErrCode(id = null, urlpath = "420", errName = "Enhance Your Calm"));
        this.insert(HttpErrCode(id = null, urlpath = "421", errName = "Misdirected Request"));
        this.insert(HttpErrCode(id = null, urlpath = "422", errName = "Unprocessable Entity"));
        this.insert(HttpErrCode(id = null, urlpath = "423", errName = "Locked"));
        this.insert(HttpErrCode(id = null, urlpath = "424", errName = "Failed Dependency"));
        this.insert(HttpErrCode(id = null, urlpath = "425", errName = "Too Early"));
        this.insert(HttpErrCode(id = null, urlpath = "426", errName = "Upgrade Require"));
        this.insert(HttpErrCode(id = null, urlpath = "428", errName = "Precondition Require"));
        this.insert(HttpErrCode(id = null, urlpath = "429", errName = "Too Many Requests"));
        this.insert(HttpErrCode(id = null, urlpath = "431", errName = "Request Header Fields Too Large"));
        this.insert(HttpErrCode(id = null, urlpath = "444", errName = "No Response"));
        this.insert(HttpErrCode(id = null, urlpath = "450", errName = "Blocked by Windows Parental Controls"));
        this.insert(HttpErrCode(id = null, urlpath = "451", errName = "Unavailable For Legal Reasons"));
        this.insert(HttpErrCode(id = null, urlpath = "497", errName = "HTTP sent to HTTPS Port"));
        this.insert(HttpErrCode(id = null, urlpath = "498", errName = "Token Expired/Invalid"));
        this.insert(HttpErrCode(id = null, urlpath = "499", errName = "Client Closed Request"));
        this.insert(HttpErrCode(id = null, urlpath = "500", errName = "Internal Server Error"));
        this.insert(HttpErrCode(id = null, urlpath = "501", errName = "Not Implemented"));
        this.insert(HttpErrCode(id = null, urlpath = "502", errName = "Bad Gateway"));
        this.insert(HttpErrCode(id = null, urlpath = "503", errName = "Service Unavailable"));
        this.insert(HttpErrCode(id = null, urlpath = "504", errName = "Gateway Timeout"));
        this.insert(HttpErrCode(id = null, urlpath = "506", errName = "Variant Also Negotiates"));
        this.insert(HttpErrCode(id = null, urlpath = "507", errName = "Insufficient Storage"));
        this.insert(HttpErrCode(id = null, urlpath = "508", errName = "Loop Detected"));
        this.insert(HttpErrCode(id = null, urlpath = "509", errName = "Bandwidth Limit Exceed"));
        this.insert(HttpErrCode(id = null, urlpath = "510", errName = "Not Extended"));
        this.insert(HttpErrCode(id = null, urlpath = "511", errName = "Network Authentication Required"));
        this.insert(HttpErrCode(id = null, urlpath = "521", errName = "Web Server is Down"));
        this.insert(HttpErrCode(id = null, urlpath = "522", errName = "Connection Timed Out"));
        this.insert(HttpErrCode(id = null, urlpath = "523", errName = "Origin Is Unreachable"));
        this.insert(HttpErrCode(id = null, urlpath = "525", errName = "SSL Handshake Failed"));
        this.insert(HttpErrCode(id = null, urlpath = "530", errName = "Site Frozen"));
        this.insert(HttpErrCode(id = null, urlpath = "599", errName = "Network Connect Timeout Error"));
    }
}