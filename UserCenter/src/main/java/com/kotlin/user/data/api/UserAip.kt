package com.kotlin.user.data.api

import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.user.data.protocol.*
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 * Created by  幻忧 on  2019/9/9 13:15
 *  @function
 */
interface UserAip {
    @POST("userCenter/register")
    fun register(@Body req: RegisterReq): Observable<BaseResp<String>>


    @POST("userCenter/login")
    fun login(@Body req: LoginReq): Observable<BaseResp<UserInfo>>

    @POST("userCenter/forgetPwd")
    fun forgetPwd(@Body req: ForgetPwdReq): Observable<BaseResp<String>>

    @POST("userCenter/resetPwd")
    fun resetPwd(@Body req: ResetPwdReq): Observable<BaseResp<String>>


}