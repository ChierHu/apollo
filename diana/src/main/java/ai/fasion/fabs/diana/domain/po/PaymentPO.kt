package ai.fasion.fabs.diana.domain.po

import java.util.*

data class PaymentPO(
    /**
     * 流水号（交易号）
     */
    var id: String,
    /**
     * 用户编号
     */
    var uid: String,

    /**
     * 类型（充值、原路退款、转账退款）
     */
    var type: String,

    /**
     * 金额
     */
    var cash: Int,

    /**
     * 点数
     */
    var point: Int,

    /**
     * 交易状态
     */
    var status: String,

    /**
     * 渠道(Wechat、Alipay)
     */
    var channel: String,

    /**
     * 订单表编号
     */
    var purchaseId: String? = null,

    /**
     * 关联流水号
     */
    var relatedTo: String? = null,

    /**
     * platform、ip、os、user_snapshot、point_expired_at
     */
    var meta: String? = null,

    /**
     * 创建时间
     */
    var createdAt: Date? = null,

    /**
     * 修改时间
     */
    var updatedAt: Date? = null,

    /**
     * 完成时间
     */
    var finishedAt: Date? = null,

    /**
     * 依赖于
     */
    var dependsOn: String? = null,

    /**
     * 槽
     */
    var slot: String? = null
)